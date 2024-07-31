package com.labib.online_food_ordering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.labib.online_food_ordering.model.Restaurant;
import com.labib.online_food_ordering.model.User;
import com.labib.online_food_ordering.request.CreateRestaurantRequest;
import com.labib.online_food_ordering.response.MessageResponse;
import com.labib.online_food_ordering.service.RestaurantService;
import com.labib.online_food_ordering.service.UserService;

@Controller
@RequestMapping("/api/admin/restaurants")
public class AdminRestaurantController {
     
    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private UserService userService;
    
    @PostMapping()
    public ResponseEntity<Restaurant>createRestaurant(
        @RequestBody CreateRestaurantRequest req,
        @RequestHeader("Authorization") String jwt
    ) throws Exception{
        User user = userService.findUserByJwtToken(jwt);
        Restaurant restaurant = restaurantService.createRestaurant(req, user);
        return new ResponseEntity<>(restaurant,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Restaurant>updatedRestaurant(
        @RequestBody CreateRestaurantRequest req,
        @RequestHeader("Authorization") String jwt,
        @PathVariable Long id
    ) throws Exception{
        User user = userService.findUserByJwtToken(jwt);
        Restaurant restaurant = restaurantService.updatedRestaurant(id, req);
        return new ResponseEntity<>(restaurant,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageResponse>deleteRestaurant(
        @RequestBody CreateRestaurantRequest req,
        @RequestHeader("Authorization") String jwt,
        @PathVariable Long id
    ) throws Exception{
        User user = userService.findUserByJwtToken(jwt);
        restaurantService.deleteRestautant(id);
        MessageResponse res = new MessageResponse();
        res.setMessage("restaurant deleted successfully");
        return new ResponseEntity<>(res,HttpStatus.OK);
    }


}
