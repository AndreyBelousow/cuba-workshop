package com.company.bikeworkshop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|name,phone")
@Table(name = "BIKEWORKSHOP_CLIENT")
@Entity(name = "bikeworkshop$Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = -4876013950446587691L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "PHONE", nullable = false, unique = true, length = 20)
    protected String phone;

    @Column(name = "EMAIL", unique = true)
    protected String email;

    @Column(name = "OTHER_CONTACTS")
    protected String otherContacts;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setOtherContacts(String otherContacts) {
        this.otherContacts = otherContacts;
    }

    public String getOtherContacts() {
        return otherContacts;
    }


}