package org.parrolabs.api.repository.ordersproducts;

import org.parrolabs.api.model.ordersproducts.OrdersProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersProductsRepository extends JpaRepository<OrdersProducts, Long> {
    List<OrdersProducts> findByProductId(Long id);
}
