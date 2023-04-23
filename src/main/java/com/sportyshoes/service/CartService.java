package com.sportyshoes.service;

import com.sportyshoes.entity.Cart;
import com.sportyshoes.entity.CartQuantity;
import com.sportyshoes.entity.User;


public interface CartService {
	
	Cart findById(int id);
	Cart saveOrUpdate(CartQuantity cartQuantity, User user);
	

}
