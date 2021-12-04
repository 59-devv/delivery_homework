package com.sparta.delievery.repository;

import com.sparta.delievery.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
