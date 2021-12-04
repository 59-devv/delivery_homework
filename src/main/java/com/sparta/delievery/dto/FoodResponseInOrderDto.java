package com.sparta.delievery.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FoodResponseInOrderDto {
    private String name;
    private Long quantity;
    private Long price;
}
