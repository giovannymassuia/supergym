package io.giovannymassuia.examples.supergym.domain.workoutplan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Getter;

// Entity
@Getter
public class WorkoutPlan {

    private String id;
    private String title;
    private String goal;
    private LocalDate start;
    private LocalDate end;
    private List<Workout> workouts;

    public WorkoutPlan(String id, String title, String goal, LocalDate start, LocalDate end,
        List<Workout> workouts) {
        this.id = id;
        this.title = title;
        this.goal = goal;
        this.start = start;
        this.end = end;
        this.workouts = workouts;
    }

    public static WorkoutPlan create(String title, String goal, LocalDate start, LocalDate end) {
        return new WorkoutPlan(
            UUID.randomUUID().toString(),
            title, goal, start, end, new ArrayList<>());
    }

}
