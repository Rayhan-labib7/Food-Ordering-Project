package com.labib.online_food_ordering.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labib.online_food_ordering.model.Address;

public interface AddressRepository extends JpaRepository<Address,Long>{

}
