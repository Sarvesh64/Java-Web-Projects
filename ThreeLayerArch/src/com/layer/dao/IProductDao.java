package com.layer.dao;

import com.layer.model.Product;

public interface IProductDao {
	Product login(Product product);
	Product authenticate(String username, String password);
}
