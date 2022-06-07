package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.Order;


public interface OrderRepository extends JpaRepository<Order, Integer> {

}
