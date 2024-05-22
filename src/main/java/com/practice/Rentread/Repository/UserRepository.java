package com.practice.Rentread.Repository;

import com.practice.Rentread.Entities.Role;
import com.practice.Rentread.Entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
