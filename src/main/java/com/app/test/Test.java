package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.app.Product;
import com.app.ProductDetails;
import com.app.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductDetails productDetails = applicationContext.getBean(ProductDetails.class);
		
		System.out.println("------ Product List By Product Id --------");
		Integer productId1 = 3;
		List<Product> productList1 = productDetails.getProductDetailsByProductId(productId1);
		productList1.forEach(p->{System.out.println(p);});
		
		System.out.println("------ Product List By Product Name -------");
		String productName1 = "Pen";
		List<Product> productList2 = productDetails.getProductDetailsByProductName(productName1);
		productList2.forEach(p->{System.out.println(p);});
		
		System.out.println("------ Product List By Product Code And Product Name --------");
		String productCode1 = "P004";
		String productName2 = "Pen";
		List<Product> productList3 = productDetails.getProductDetailsByProductCodeAndProductName(productCode1, productName2);
		productList3.forEach(p->{System.out.println(p);});
	}
}
