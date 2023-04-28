package org.parrolabs.api.repository.shippingaddress;


import org.parrolabs.api.model.shipping.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends JpaRepository<ShippingAddress, Long> {
}
