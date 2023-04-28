package org.parrolabs.api.model.ordersproducts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.parrolabs.api.model.orders.Orders;
import org.parrolabs.api.model.products.Products;


@Entity
@Table(name = "ordersproducts")
public class OrdersProducts implements Cloneable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false)
    private Products product;
    @ManyToOne(optional = false)
    private Orders order;
    private Long quantity;
    private Double totalValue;
    
    

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Products getProduct() {
		return product;
	}



	public void setProduct(Products product) {
		this.product = product;
	}



	public Orders getOrder() {
		return order;
	}



	public void setOrder(Orders order) {
		this.order = order;
	}



	public Long getQuantity() {
		return quantity;
	}



	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}



	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}



	public Double getTotalValue() {
        return quantity * product.getPrice();
    }

}
