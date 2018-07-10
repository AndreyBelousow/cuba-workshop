package com.company.workshop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s %s|status,client,worker")
@Table(name = "WORKSHOP_ORDER")
@Entity(name = "workshop$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 4203656920223944380L;

    @Column(name = "STATUS")
    protected Integer status;

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

    @JoinTable(name = "WORKSHOP_ORDER_SPARE_PART_LINK",
        joinColumns = @JoinColumn(name = "ORDER_ID"),
        inverseJoinColumns = @JoinColumn(name = "SPARE_PART_ID"))
    @ManyToMany
    protected List<SparePart> parts;

    @Column(name = "HOURS_SPEND")
    protected Integer hoursSpend;

    @Column(name = "TOTAL_AMOUNT")
    protected BigDecimal totalAmount;

    public void setParts(List<SparePart> parts) {
        this.parts = parts;
    }

    public List<SparePart> getParts() {
        return parts;
    }

    public void setHoursSpend(Integer hoursSpend) {
        this.hoursSpend = hoursSpend;
    }

    public Integer getHoursSpend() {
        return hoursSpend;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
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


    public void setStatus(OrderStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public OrderStatus getStatus() {
        return status == null ? null : OrderStatus.fromId(status);
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }


}