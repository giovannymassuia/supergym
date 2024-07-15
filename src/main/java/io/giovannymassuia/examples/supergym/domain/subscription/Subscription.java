package io.giovannymassuia.examples.supergym.domain.subscription;

import io.giovannymassuia.examples.supergym.domain.subscription.rules.SubscriptionRule;
import io.giovannymassuia.examples.supergym.domain.subscription.rules.WorkoutPlanRule;
import io.giovannymassuia.examples.supergym.domain.subscription.rules.WorkoutRule;
import java.util.List;
import lombok.Getter;

@Getter
public class Subscription {

    private int maxWorkoutCount;

    private List<SubscriptionRule> subscriptionRules;
    private List<WorkoutPlanRule> workoutPlanRules;
    private List<WorkoutRule> workoutRules;

}
