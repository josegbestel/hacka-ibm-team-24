package com.team24.hackaibm.model.representationModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StoreRepresentationModel implements Serializable {
    private List<StoreItemRepresentationModel> storeItems = new ArrayList<>();

    public List<StoreItemRepresentationModel> getStoreItems() {
        return storeItems;
    }

    public void setStoreItems(List<StoreItemRepresentationModel> storeItems) {
        this.storeItems = storeItems;
    }

    public void addStoreItems(StoreItemRepresentationModel storeItem) {
        this.storeItems.add(storeItem);
    }
}
