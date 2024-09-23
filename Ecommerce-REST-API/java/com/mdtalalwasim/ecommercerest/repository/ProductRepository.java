package com.mdtalalwasim.ecommercerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdtalalwasim.ecommercerest.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
