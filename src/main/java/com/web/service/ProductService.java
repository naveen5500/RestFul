package com.web.service;

import java.util.List;

import com.web.entity.Product;

public interface ProductService {
 public Product saveProduct(Product product);
 public Product editProduct(Product product);
 public Product getProduct(Long id);
 public List<Product> getAll();
public Product getProductById(Long id, Product product);
public Double getDiscountedPrice(Long id, Double discountPercentage);
public Double getPriceWithGst(Long id, Double gstPercentage);
public Double getDeliveryCharges(Long id, Double distance);
void deleteProduct(Long id);
public Product save(Product product);
 }
