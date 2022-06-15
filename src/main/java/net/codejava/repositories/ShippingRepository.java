package net.codejava.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping, Integer> {
	List<Shipping> findByAccountId(Integer accountId);
}
