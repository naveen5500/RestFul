		package com.web.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    
    @Id
    @Column(name = "product_id")
    private Long id;
    
    @Column(name = "product_name")
    private String name;
    
    @Column(name = "product_type")
    private String type;
    
    @Column(name = "product_category")
    private String category;
    
    @Column(name = "product_price")
    private double price;
    
    public Product() {}
    
    public Product(String name, String type, String category, double price) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.price = price;
    }
    
    // Getters and setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

	public int getProductPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}

