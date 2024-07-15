package io.giovannymassuia.examples.supergym.application.repository;

import io.giovannymassuia.examples.supergym.domain.User;
import java.util.Optional;

public interface UserRepository {

    Optional<User> getById(String userId);
}
