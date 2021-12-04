package com.sparta.delievery.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FoodRequestInOrderDto {
    private Long id;
    private Long quantity;
}
