package com.company.bikeworkshop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|title")
@Table(name = "BIKEWORKSHOP_SPARE_PART")
@Entity(name = "bikeworkshop$SparePart")
public class SparePart extends StandardEntity {
    private static final long serialVersionUID = -2546695689343284117L;

    @NotNull
    @Column(name = "TITLE", nullable = false, unique = true)
    protected String title;

    @Column(name = "DESCRIPTION")
    protected String description;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

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