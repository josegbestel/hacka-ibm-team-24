package com.team24.hackaibm.model.representationModel;

import com.team24.hackaibm.model.Item;
import com.team24.hackaibm.model.Product;
import com.team24.hackaibm.utils.CustomDate;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NewItemRepresentationModel implements Serializable {

    private String title;
    private String amount;
    private Float price;
    private String image;
    private String created;
    private SellerRepresentationModel seller;
    private Long productId;

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

    private String getCreated() {
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Item toDomain(Product product){
        Item domain = new Item();

        domain.setTitle(this.title);
        domain.setAmount(this.amount);
        domain.setPrice(this.price);
        domain.setImage(this.image);

        LocalDate localDate = LocalDate.now();//For reference
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.LLL.yyyy");
        String formattedString = localDate.format(formatter);
        domain.setCreated(formattedString);

        domain.setSellerName(this.getSeller().getName());
        domain.setSellerLocation(this.getSeller().getLocation());
        domain.setSellerContact(this.getSeller().getContact())
        ;
        domain.setProduct(product);

        return domain;
    }

    public static NewItemRepresentationModel byDomain(Item domain) {
        NewItemRepresentationModel item = new NewItemRepresentationModel();
        item.setTitle(domain.getTitle());
        item.setAmount(domain.getAmount());
        item.setPrice(domain.getPrice());
        item.setImage(domain.getImage());
        item.setCreated(domain.getCreated());
        item.setProductId(domain.getProduct().getId());

        SellerRepresentationModel seller = new SellerRepresentationModel();
        seller.setName(domain.getSellerName());
        seller.setLocation(domain.getSellerLocation());
        seller.setContact(domain.getSellerContact());
        item.setSeller(seller);

        return item;
    }
}
