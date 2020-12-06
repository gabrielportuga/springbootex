package com.portuga.springbootex.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portuga.springbootex.domain.Category;
import com.portuga.springbootex.repositories.ICatergoryRepository;
import com.portuga.springbootex.services.exception.ObjectNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private ICatergoryRepository repo;

	public Category find(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Category.class.getName()));
	}
}
