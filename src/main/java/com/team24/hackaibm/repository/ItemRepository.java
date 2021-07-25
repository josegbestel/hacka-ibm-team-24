package com.team24.hackaibm.repository;

import com.team24.hackaibm.model.Item;
import com.team24.hackaibm.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByProduct(Product product);

    Optional<Item> findByTitleAndSellerContact(String title, String contact);
}
