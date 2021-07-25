package com.team24.hackaibm.model.representationModel;

import com.team24.hackaibm.model.Item;
import com.team24.hackaibm.utils.CustomDate;

import java.io.Serializable;

public class ItemRepresentationModel implements Serializable {


    private long id;
    private String title;
    private String amount;
    private Float price;
    private String image;
    private String created;
    private SellerRepresentationModel seller;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public SellerRepresentationModel getSeller() {
        return seller;
    }

    public void setSeller(SellerRepresentationModel seller) {
        this.seller = seller;
    }

    public static ItemRepresentationModel byDomain(Item domain) {
        ItemRepresentationModel item = new ItemRepresentationModel();
        item.setTitle(domain.getTitle());
        item.setAmount(domain.getAmount());
        item.setPrice(domain.getPrice());
        item.setImage(domain.getImage());
        item.setCreated(domain.getCreated());
        item.setSeller(SellerRepresentationModel.byDomain(domain.getSeller()));

        return item;
    }
}
