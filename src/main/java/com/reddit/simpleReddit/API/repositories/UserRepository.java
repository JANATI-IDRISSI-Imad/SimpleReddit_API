package com.reddit.simpleReddit.API.repositories;

import com.reddit.simpleReddit.API.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    public User findUserByUsername(String username);
}
