package com.sparta.delievery.repository;

import com.sparta.delievery.model.Food;
import com.sparta.delievery.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findAllByRestaurant(Restaurant restaurant);
    Food findByRestaurantAndId(Restaurant restaurant, Long foodId);
    boolean existsByRestaurantAndName(Restaurant restaurant, String name);
}
