package com.sparta.delievery.controller;

import com.sparta.delievery.dto.OrderRequestDto;
import com.sparta.delievery.dto.OrderResponseDto;
import com.sparta.delievery.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order/request")
    public OrderResponseDto makeOrder(@RequestBody OrderRequestDto requestDto) {

        return orderService.makeOrder(requestDto);
    }

    @GetMapping("/orders")
    public List<OrderResponseDto> getAllOrders() {
        return orderService.getAllOrders();
    }
}