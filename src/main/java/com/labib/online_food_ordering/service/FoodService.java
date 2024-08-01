package com.labib.online_food_ordering.service;

import java.util.List;

import com.labib.online_food_ordering.model.Category;
import com.labib.online_food_ordering.model.Food;
import com.labib.online_food_ordering.model.Restaurant;
import com.labib.online_food_ordering.request.CreateFoodRequest;

public interface FoodService {
   
    public Food createFood(CreateFoodRequest req,Category category,Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;

    public List<Food>getRestaurantFood(Long restaurantId,
              boolean isVegitarian,
              boolean isNonveg,
              boolean isSeasonal,
              String FoodCategory);

    public List<Food>searchFood(String keyword);
    public Food findFoodById(Long foodId) throws Exception;
    public Food updateAvailibityStatus(Long foodId) throws Exception;

}
