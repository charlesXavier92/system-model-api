package org.parrolabs.api.model.orders;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.parrolabs.api.enums.orders.PaymentType;
import org.parrolabs.api.model.customers.Customers;
import org.parrolabs.api.model.ordersproducts.OrdersProducts;
import org.parrolabs.api.model.shipping.ShippingAddress;


@Entity
@Table(name = "orders")
public class Orders implements Cloneable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNumber;
    private LocalDate date;
    @ManyToOne(optional = false)
    private Customers customer;
    @ManyToOne(optional = false)
    private ShippingAddress shippingAddress;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    @OneToMany(fetch=FetchType.LAZY, mappedBy="order")
    private List<OrdersProducts> listOrdersProducts;
    private Double totalValue;
    
    

    public Orders(Long orderNumber, LocalDate date, Customers customer, ShippingAddress shippingAddress,
			PaymentType paymentType, List<OrdersProducts> listOrdersProducts, Double totalValue) {
		super();
		this.orderNumber = orderNumber;
		this.date = date;
		this.customer = customer;
		this.shippingAddress = shippingAddress;
		this.paymentType = paymentType;
		this.listOrdersProducts = listOrdersProducts;
		this.totalValue = totalValue;
	}

	public Double getTotalValue(){
        this.totalValue = 0D;
        this.listOrdersProducts.forEach(
                value -> {
                    this.totalValue = this.totalValue + value.getTotalValue();
                }
        );
        return this.totalValue;
    }

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public List<OrdersProducts> getListOrdersProducts() {
		return listOrdersProducts;
	}

	public void setListOrdersProducts(List<OrdersProducts> listOrdersProducts) {
		this.listOrdersProducts = listOrdersProducts;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
    
    
}
