package io.giovannymassuia.examples.supergym.application.repository;

import io.giovannymassuia.examples.supergym.domain.workoutplan.WorkoutPlan;

public interface WorkoutPlanRepository {

    void save(WorkoutPlan workoutPlan);

    int countByUserId(String s);
}
