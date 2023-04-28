package org.parrolabs.api.repository.customers;

import org.parrolabs.api.model.customers.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {
}
