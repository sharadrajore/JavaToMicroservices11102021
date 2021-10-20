package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Product;
import com.zensar.spring.controllers.ProductController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
       
      ProductController productController= context.getBean("productController",ProductController.class);
      
      Product product=new Product();
      product.setProductId(1);
      product.setProductName("Laptop");
      product.setProductCost(50000);
      
      productController.insertProduct(product);
      
      
      
    }
}
