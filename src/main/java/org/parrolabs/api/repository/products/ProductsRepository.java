package org.parrolabs.api.repository.products;

import org.parrolabs.api.model.products.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
}
