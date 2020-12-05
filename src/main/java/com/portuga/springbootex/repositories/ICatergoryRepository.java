package com.portuga.springbootex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portuga.springbootex.domain.Category;

@Repository
public interface ICatergoryRepository extends JpaRepository<Category, Integer> {

}
