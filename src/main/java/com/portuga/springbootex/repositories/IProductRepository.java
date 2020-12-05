package com.portuga.springbootex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portuga.springbootex.domain.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

}
