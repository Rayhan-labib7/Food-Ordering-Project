package com.labib.online_food_ordering.request;

import java.util.List;

import com.labib.online_food_ordering.model.Category;
import com.labib.online_food_ordering.model.IngredientsItem;

public class CreateFoodRequest {
    
    private String name;
    private String description;
    private Long price;
    private Category category;
    private List<String>images;
    private Long restautantId;
    private boolean vegetarian;
    private List<IngredientsItem>ingredients;
    


}
