package io.giovannymassuia.examples.supergym.domain.subscription.rules;

import io.giovannymassuia.examples.supergym.domain.subscription.Rule;
import io.giovannymassuia.examples.supergym.domain.workoutplan.WorkoutPlan;

public abstract class WorkoutPlanRule implements Rule {

    public abstract boolean evaluate(WorkoutPlan workoutPlan);
}
