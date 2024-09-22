package com.mdtalalwasim.ecommercerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdtalalwasim.ecommercerest.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
