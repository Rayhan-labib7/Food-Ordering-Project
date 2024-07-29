package com.labib.online_food_ordering.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labib.online_food_ordering.model.User;


public interface UserRepository extends JpaRepository<User,Long>{

    public User findByEmail(String username);
}
