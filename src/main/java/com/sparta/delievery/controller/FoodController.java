package com.sparta.delievery.controller;

import com.sparta.delievery.dto.FoodDto;
import com.sparta.delievery.model.Food;
import com.sparta.delievery.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class FoodController {

    private final FoodService foodService;

    @PostMapping("/restaurant/{restaurantId}/food/register")
    public void registerFood(@PathVariable Long restaurantId, @RequestBody List<FoodDto> foods) {
        foodService.register(restaurantId, foods);

    }

    @GetMapping("/restaurant/{restaurantId}/foods")
    public List<Food> getAllRestaurants(@PathVariable Long restaurantId) {
        return foodService.getAllFoods(restaurantId);
    }
}
