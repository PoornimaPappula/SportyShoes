package com.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.entity.CartQuantity;

public interface CartQuantityRepository extends JpaRepository<CartQuantity, Integer>{

}
