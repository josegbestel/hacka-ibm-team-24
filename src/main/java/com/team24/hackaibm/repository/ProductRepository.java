package com.team24.hackaibm.repository;

import com.team24.hackaibm.model.Product;
import com.team24.hackaibm.model.Seller;
import com.team24.hackaibm.model.enums.ProductCategory;
import com.team24.hackaibm.model.representationModel.ItemRepresentationModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(ProductCategory category);
}
