package com.mdtalalwasim.ecommercerest.service;

import java.util.List;

import com.mdtalalwasim.ecommercerest.entity.Category;



public interface CategoryService {
	
	public Category saveCategory(Category category);
	
	public List<Category> getAllCategory();

}
