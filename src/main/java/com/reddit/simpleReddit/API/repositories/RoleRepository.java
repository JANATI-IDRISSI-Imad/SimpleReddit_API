package com.reddit.simpleReddit.API.repositories;

import com.reddit.simpleReddit.API.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    public Role findRoleByRole(String role);
}
