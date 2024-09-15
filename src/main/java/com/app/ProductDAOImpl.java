package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Product> getProductByProductId(Integer productId) {
		String queryName = "Product.findByProductId";
		List<Product> productList = (List<Product>) hibernateTemplate.findByNamedQuery(queryName, productId);
		
		return productList;
	}

	@Override
	public List<Product> getProductByProductName(String productName) {
		String queryName = "Product.findByProductName";
		List<Product> productList = (List<Product>) hibernateTemplate.findByNamedQuery(queryName, productName);
		
		return productList;
	}

	@Override
	public List<Product> getProductByProductCodeAndProductName(String productCode, String productName) {
		String queryName = "Product.findByProductCodeAndProductName";
		List<Product> productList = (List<Product>) hibernateTemplate.findByNamedQuery(queryName, productCode, productName);
		
		return productList;
	}
	
}
