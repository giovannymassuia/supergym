package io.giovannymassuia.examples.supergym.domain.subscription.rules;

import io.giovannymassuia.examples.supergym.domain.subscription.Rule;
import io.giovannymassuia.examples.supergym.domain.workoutplan.Workout;

public abstract class WorkoutRule implements Rule {

    public abstract boolean evaluate(Workout workoutPlan);
}
