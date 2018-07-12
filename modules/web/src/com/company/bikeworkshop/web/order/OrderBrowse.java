package com.company.bikeworkshop.web.order;

import com.company.bikeworkshop.entity.Order;
import com.company.bikeworkshop.entity.OrderStatus;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.data.CollectionDatasource;

import javax.inject.Inject;
import java.util.UUID;

public class OrderBrowse extends AbstractLookup {

    @Inject
    private CollectionDatasource<Order, UUID> ordersDs;

    public void onSetNewStatusButtonClick(Component source) {
        Order selectedItem = ordersDs.getItem();
        if (selectedItem != null) {
            selectedItem.setStatus(OrderStatus.NEW);
            ordersDs.commit();
        }
    }

    public void onSetInProgressStatusButtonClick() {
        Order selectedItem = ordersDs.getItem();
        if (selectedItem != null) {
            selectedItem.setStatus(OrderStatus.IN_PROGRESS);
            ordersDs.commit();
        }
    }

    public void onSetReturnedStatusButtonClick() {
        Order selectedItem = ordersDs.getItem();
        if (selectedItem != null) {
            selectedItem.setStatus(OrderStatus.RETURNED);
            ordersDs.commit();
        }
    }

    public void onSetReadyStatusButtonClick() {
        Order selectedItem = ordersDs.getItem();
        if (selectedItem != null) {
            selectedItem.setStatus(OrderStatus.READY);
            ordersDs.commit();
        }
    }
}