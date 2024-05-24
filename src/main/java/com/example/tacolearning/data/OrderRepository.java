package com.example.tacolearning.data;

import com.example.tacolearning.Order;

public interface OrderRepository {

    Order save(Order order);
}
