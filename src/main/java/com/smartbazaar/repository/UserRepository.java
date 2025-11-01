package com.smartbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartbazaar.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
