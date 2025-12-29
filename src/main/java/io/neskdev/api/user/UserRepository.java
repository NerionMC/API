package io.neskdev.api.user;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

public interface UserRepository {
    ConcurrentMap<UUID, User> getCache();

    User getUser(UUID id);

    List<User> getUsers();

    void saveUser(User user);

    void createUser(UUID uniqueId, String name);

    void deleteUser(User user);
}
