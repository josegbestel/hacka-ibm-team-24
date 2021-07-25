package com.team24.hackaibm.repository;

import com.team24.hackaibm.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
