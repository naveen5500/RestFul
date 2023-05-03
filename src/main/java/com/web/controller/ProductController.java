package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Product;
import com.web.service.ProductService;

@RestController
public class ProductController {
	
		    @Autowired
	    private ProductService productService;
		    @PostMapping("/save")
		    public String save(@RequestBody Product product) {
		    	Product e = productService.saveProduct(product);
		    	String message = null;
		    	if(e!=null)
		    	{
		    		message = "data inserted succesfully";
		    		
		    	}else {
		    		message = "data not inserted succesfully";
		    	}
		    	
		    	return message;
		    }
		        @PutMapping("/{id}")
		        public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) throws Throwable {
		            Product product = new Product();
		            product.setName(productDetails.getName());
		            product.setType(productDetails.getType());
		            product.setCategory(productDetails.getCategory());
		            product.setPrice(productDetails.getPrice());
		            return productService.save(product);
		        }
		    @DeleteMapping("/delete/{id}")
		    public void delete(@PathVariable Long id) {
		    	productService.deleteProduct(id);
		    	}

	    @GetMapping("/{id}")
	    public Product getProductById(@PathVariable Long id) {
	        return productService.getProduct(id);
	    }

	    @GetMapping("/discount/{id}/{discountPercentage}")
	    public Double getDiscountedPrice(@PathVariable Long id, @PathVariable Double discountPercentage) {
	        return productService.getDiscountedPrice(id, discountPercentage);
	    }

	    @GetMapping("/gst/{id}/{gstPercentage}")
	    public Double getPriceWithGst(@PathVariable Long id, @PathVariable Double gstPercentage) {
	        return productService.getPriceWithGst(id, gstPercentage);
	    }

	    @GetMapping("/delivery/{id}/{distance}")
	    public Double getDeliveryCharges(@PathVariable Long id, @PathVariable Double distance) {
	        return productService.getDeliveryCharges(id, distance);
	    }
	}

