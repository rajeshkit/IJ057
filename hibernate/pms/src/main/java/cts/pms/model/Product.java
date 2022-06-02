package cts.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {  // pojo or entity or model or dto class
	@Id
	private int productId;
	private String productName;
	private float cost;
	private int quantity;
	
	public Product() {
		super();
	}
	public Product(int productId, String productName, float cost, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
