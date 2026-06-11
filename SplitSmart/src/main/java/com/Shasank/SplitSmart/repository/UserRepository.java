package com.Shasank.SplitSmart.repository;

import com.Shasank.SplitSmart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}