package com.mdtalalwasim.ecommercerest.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdtalalwasim.ecommercerest.entity.Category;
import com.mdtalalwasim.ecommercerest.repository.CategoryRepository;
import com.mdtalalwasim.ecommercerest.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category saveCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
