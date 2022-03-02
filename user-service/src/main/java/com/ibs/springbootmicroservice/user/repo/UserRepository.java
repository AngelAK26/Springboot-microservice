package com.ibs.springbootmicroservice.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibs.springbootmicroservice.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{


}
