package com.mouritech.sellermanagementsystemrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.sellermanagementsystemrestapi.entity.Seller;

@Repository("sellerRepository")
public interface SellerRepository extends JpaRepository<Seller, Long> {

}