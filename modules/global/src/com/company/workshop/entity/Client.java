package com.company.workshop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@NamePattern("%s %s %s|name,phone,contacts")
@Table(name = "WORKSHOP_CLIENT")
@Entity(name = "workshop$Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = -6450140737914129463L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "PHONE")
    protected String phone;


    @Column(name = "CONTACTS")
    protected String contacts;

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContacts() {
        return contacts;
    }


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


}