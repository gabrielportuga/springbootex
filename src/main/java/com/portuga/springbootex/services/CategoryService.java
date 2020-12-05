package com.portuga.springbootex.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portuga.springbootex.domain.Category;
import com.portuga.springbootex.repositories.ICatergoryRepository;

@Service
public class CategoryService {

	@Autowired
	private ICatergoryRepository repo;
	
	public Category find(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
