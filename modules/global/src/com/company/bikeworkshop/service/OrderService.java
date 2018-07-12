package com.company.bikeworkshop.service;


import com.company.bikeworkshop.entity.Order;

import java.math.BigDecimal;

public interface OrderService {
    String NAME = "bikeworkshop_OrderService";

    public BigDecimal calculateTotalCost(Order order);
}