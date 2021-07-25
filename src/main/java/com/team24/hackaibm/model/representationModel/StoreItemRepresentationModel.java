package com.team24.hackaibm.model.representationModel;

import com.team24.hackaibm.model.enums.ProductCategory;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StoreItemRepresentationModel implements Serializable {

    private ProductCategory category;
    private List<ItemRepresentationModel> items = new ArrayList<>();

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public List<ItemRepresentationModel> getItems() {
        return items;
    }

    public void setItems(List<ItemRepresentationModel> items) {
        this.items = items;
    }

    public void addItem(ItemRepresentationModel item) {
        this.items.add(item);
    }
}
