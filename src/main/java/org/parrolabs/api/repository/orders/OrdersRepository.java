package org.parrolabs.api.repository.orders;

import org.parrolabs.api.model.customers.Customers;
import org.parrolabs.api.model.orders.Orders;
import org.parrolabs.api.model.ordersproducts.OrdersProducts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

    List<Orders> findByCustomerId(Long id);
}
