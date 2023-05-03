package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Product;
import com.web.repo.ProductRepo;
@Service
public class ProductServiceImp implements ProductService {
	
	    @Autowired
	    private ProductRepo productRepository;

		@Override
		public Product saveProduct(Product product) {
			Product p = productRepository.save(product);
				return p;
		}

		@Override
		public Product editProduct(Product product) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Product getProduct(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Product> getAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Product getProductById(Long id, Product product) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Double getDiscountedPrice(Long id, Double discountPercentage) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Double getPriceWithGst(Long id, Double gstPercentage) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Double getDeliveryCharges(Long id, Double distance) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteProduct(Long id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Product save(Product product) {
			// TODO Auto-generated method stub
			return null;
		}
}

	  	