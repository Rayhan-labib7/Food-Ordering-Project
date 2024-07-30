package com.labib.online_food_ordering.request;

import java.util.List;

import com.labib.online_food_ordering.model.Address;
import com.labib.online_food_ordering.model.ContactInformation;

import lombok.Data;

@Data
public class CreateRestaurantRequest {
        private Long id;
        private String name;
        private String description;
        private String cuisineType;
        private Address address;
        private ContactInformation contactInformation;
        private String openingHours;
        private List<String>images;
        
}
