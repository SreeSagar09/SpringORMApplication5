package com.app;

import java.util.List;

public interface ProductDAO {
	
	public List<Product> getProductByProductId(Integer productId);
	
	public List<Product> getProductByProductName(String productName);
	
	public List<Product> getProductByProductCodeAndProductName(String productCode, String productName);
}
