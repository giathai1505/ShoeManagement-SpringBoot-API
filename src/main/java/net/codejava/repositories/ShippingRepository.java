package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping, Integer> {

}
