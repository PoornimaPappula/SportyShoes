package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.entity.Size;


public interface SizeService {

	Size findById(int id);
	
	List<Size> findAll();
	
	Size saveOrUpdate(Size size);
	
	void removeById(int id);
	
}
