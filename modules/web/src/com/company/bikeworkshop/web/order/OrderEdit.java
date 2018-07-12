package com.company.bikeworkshop.web.order;

import com.company.bikeworkshop.service.OrderService;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.bikeworkshop.entity.Order;

import javax.inject.Inject;

public class OrderEdit extends AbstractEditor<Order> {

    @Inject
    private OrderService orderService;

    @Override
    protected boolean preCommit() {
        Order order = getItem();
        order.setTotalCost(orderService.calculateTotalCost(order));
        return super.preCommit();
    }
}