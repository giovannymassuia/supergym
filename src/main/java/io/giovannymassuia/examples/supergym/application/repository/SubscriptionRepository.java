package io.giovannymassuia.examples.supergym.application.repository;

import io.giovannymassuia.examples.supergym.domain.subscription.Subscription;
import java.util.Optional;

public interface SubscriptionRepository {

    Optional<Subscription> getById(String subscriptionId);
}
