package com.team24.hackaibm.model.representationModel;

import com.team24.hackaibm.model.Seller;

import java.io.Serializable;

public class SellerRepresentationModel implements Serializable {
    private long id;
    private String name;
    private String location;
    private String contact;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Seller toDomain() {
        Seller seller = new Seller();
        seller.setContact(this.contact);
        seller.setName(this.name);
        seller.setLocation(this.location);

        return seller;
    }



    public static SellerRepresentationModel byDomain(Seller seller) {
        SellerRepresentationModel rep = new SellerRepresentationModel();
        rep.setName(seller.getName());
        rep.setContact(seller.getContact());
        rep.setLocation(seller.getContact());

        return rep;
    }
}
