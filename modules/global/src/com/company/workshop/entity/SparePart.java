package com.company.workshop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@NamePattern("%s %s %s|title,description,price")
@Table(name = "WORKSHOP_SPARE_PART")
@Entity(name = "workshop$SparePart")
public class SparePart extends StandardEntity {
    private static final long serialVersionUID = -7571312583814288169L;

    @Column(name = "TITLE")
    protected String title;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @JoinTable(name = "WORKSHOP_ORDER_SPARE_PART_LINK",
        joinColumns = @JoinColumn(name = "SPARE_PART_ID"),
        inverseJoinColumns = @JoinColumn(name = "ORDER_ID"))
    @ManyToMany
    protected List<Order> orders;

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }


}