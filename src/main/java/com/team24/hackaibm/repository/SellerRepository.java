package com.team24.hackaibm.repository;

import com.team24.hackaibm.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Optional<Seller> findByContact(String contact);
}
