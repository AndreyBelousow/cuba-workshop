package com.company.bikeworkshop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|description,status")
@Table(name = "BIKEWORKSHOP_ORDER")
@Entity(name = "bikeworkshop$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = -4060454811651849209L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENT_ID")
    protected Client client;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "WORKER_ID")
    protected Worker worker;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "HOURS_SPENT")
    protected Integer hoursSpent;

    @Column(name = "TOTAL_COST")
    protected BigDecimal totalCost;

    @JoinTable(name = "BIKEWORKSHOP_ORDER_SPARE_PART_LINK",
        joinColumns = @JoinColumn(name = "ORDER_ID"),
        inverseJoinColumns = @JoinColumn(name = "SPARE_PART_ID"))
    @ManyToMany
    protected List<SparePart> parts;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    protected Integer status;

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setHoursSpent(Integer hoursSpent) {
        this.hoursSpent = hoursSpent;
    }

    public Integer getHoursSpent() {
        return hoursSpent;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setParts(List<SparePart> parts) {
        this.parts = parts;
    }

    public List<SparePart> getParts() {
        return parts;
    }

    public void setStatus(OrderStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public OrderStatus getStatus() {
        return status == null ? null : OrderStatus.fromId(status);
    }


}