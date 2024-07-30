package com.labib.online_food_ordering.service;

import java.util.List;

import com.labib.online_food_ordering.dto.RestaurantDto;
import com.labib.online_food_ordering.model.Restaurant;
import com.labib.online_food_ordering.model.User;
import com.labib.online_food_ordering.request.CreateRestaurantRequest;

public interface RestaurantService {

   public Restaurant createRestaurant(CreateRestaurantRequest req,User user);

   public Restaurant updateRestaurant(Long restaurantId,CreateRestaurantRequest updatedRestaurant) throws Exception;

   public void deleteRestautant(Long restaurantId) throws Exception;

   public List<Restaurant>getAllRestaurant();
 
   public List<Restaurant>searchRestaurant();

   public Restaurant findRestaurantById(Long id) throws Exception;
   
   public Restaurant getRestaurantByUserId(Long userId) throws Exception;

   public RestaurantDto addToFavorites(Long restaurantId,User user) throws Exception;

   public Restaurant updateRestaurantStatus(Long id) throws Exception;


   

}
