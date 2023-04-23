package com.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
