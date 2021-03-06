package com.sparta.delievery.controller;

import com.sparta.delievery.dto.RestaurantDto;
import com.sparta.delievery.model.Restaurant;
import com.sparta.delievery.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RestaurantController {

    private final RestaurantService restaurantService;

    @PostMapping("/restaurant/register")
    public Restaurant registerRestaurant(@RequestBody RestaurantDto restaurantDto) {
        Restaurant restaurant = restaurantService.register(restaurantDto);

        return restaurant;

    }

    @GetMapping("/restaurants")
    public List<Restaurant> getAllRestaurants() {
        List<Restaurant> restaurantList = restaurantService.getAllRestaurants();
        return restaurantList;
    }
}
