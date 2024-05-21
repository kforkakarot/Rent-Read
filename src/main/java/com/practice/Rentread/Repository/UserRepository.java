package com.practice.Rentread.Repository;

import com.practice.Rentread.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
