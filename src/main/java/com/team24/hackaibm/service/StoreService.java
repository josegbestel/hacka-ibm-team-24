package com.team24.hackaibm.service;

import com.team24.hackaibm.model.Item;
import com.team24.hackaibm.model.Product;
import com.team24.hackaibm.model.enums.ProductCategory;
import com.team24.hackaibm.model.representationModel.ItemRepresentationModel;
import com.team24.hackaibm.model.representationModel.NewItemRepresentationModel;
import com.team24.hackaibm.model.representationModel.StoreItemRepresentationModel;
import com.team24.hackaibm.model.representationModel.StoreRepresentationModel;
import com.team24.hackaibm.repository.ItemRepository;
import com.team24.hackaibm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ProductRepository productRepository;

    //CREATE
    public NewItemRepresentationModel create(NewItemRepresentationModel newItem){
        Optional<Product> optProduct = productRepository.findById(newItem.getProductId());

        Optional<Item> optItem = itemRepository.findByTitleAndSellerContact(newItem.getTitle(), newItem.getSeller().getContact());

        if(optItem.isPresent()){
            NewItemRepresentationModel created = NewItemRepresentationModel.byDomain(optItem.get());
            return created;
        }

        if(optProduct.isPresent()){
            Item item = newItem.toDomain(optProduct.get());
            item = itemRepository.save(item);

            NewItemRepresentationModel created = NewItemRepresentationModel.byDomain(item);
            return created;
        }
        return null;
    }

    //GET ALL
    public StoreRepresentationModel getAll(){
        StoreRepresentationModel store = new StoreRepresentationModel();
        for(ProductCategory category : ProductCategory.values()){
            StoreItemRepresentationModel storeItem = new StoreItemRepresentationModel();
            storeItem.setCategory(category);

            List<Product> products = productRepository.findByCategory(category);
            for (Product product : products){
                List<Item> items = itemRepository.findByProduct(product);
                for(Item item : items){
                    ItemRepresentationModel itemRep = ItemRepresentationModel.byDomain(item);
                    storeItem.addItem(itemRep);
                }
            }
            if(storeItem.getItems().size() > 0){
                store.addStoreItems(storeItem);
            }
        }

        return store;
    }
}
