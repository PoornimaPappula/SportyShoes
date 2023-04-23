package com.sportyshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoes.entity.Product;
import com.sportyshoes.entity.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size, Integer> {

	
	List<Size> findByProduct(Product product);
	
}
