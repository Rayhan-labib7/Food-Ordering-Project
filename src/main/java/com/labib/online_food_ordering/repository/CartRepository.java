package com.labib.online_food_ordering.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labib.online_food_ordering.model.Cart;

public interface CartRepository extends JpaRepository<Cart,Long>{
    

}
