package io.giovannymassuia.examples.supergym.application.usecase;

import io.giovannymassuia.examples.supergym.application.repository.SubscriptionRepository;
import io.giovannymassuia.examples.supergym.application.repository.UserRepository;
import io.giovannymassuia.examples.supergym.application.repository.WorkoutPlanRepository;
import io.giovannymassuia.examples.supergym.domain.workoutplan.WorkoutPlan;
import io.giovannymassuia.examples.supergym.shared.ApplicationException;
import java.time.LocalDate;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateWorkoutPlanUseCase {

    private final WorkoutPlanRepository workoutPlanRepository;
    private final UserRepository userRepository;
    private final SubscriptionRepository subscriptionRepository;

    public Output execute(Input input) {
        var user = userRepository.getById(input.userId())
                       .orElseThrow(() -> new ApplicationException("user not found"));
        var subscription = subscriptionRepository.getById(user.getSubscriptionId())
                               .orElseThrow(() -> new ApplicationException("sub not found"));

        // check workout count
        int workoutCount = workoutPlanRepository.countByUserId(input.userId());
        if (workoutCount >= subscription.getMaxWorkoutCount()) {
            throw new ApplicationException("user have reached limit of workouts for this plan");
        }

        var workoutPlan = WorkoutPlan.create(
            input.title(), input.goal(), input.start(), input.end());

        workoutPlanRepository.save(workoutPlan);
        return new Output(workoutPlan.getId());
    }

    public record Input(String userId, String title, String goal, LocalDate start, LocalDate end) {

    }

    public record Output(String workoutPlanId) {

    }

}
