package io.giovannymassuia.examples.supergym.domain.subscription.rules;

import io.giovannymassuia.examples.supergym.domain.User;
import io.giovannymassuia.examples.supergym.domain.subscription.Rule;
import io.giovannymassuia.examples.supergym.domain.subscription.Subscription;

public abstract class SubscriptionRule implements Rule {

    public abstract boolean evaluate(User user, Subscription subscription);

    public static class MaxWorkoutCountRule extends SubscriptionRule {

        private int maxWorkoutCount = 10;

        @Override
        public boolean evaluate(User user, Subscription subscription) {
            // fetch current count of workouts for the user
            // evaluate rule

            return false;
        }
    }
}
