package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.Orderr;


public interface OrderRepository extends JpaRepository<Orderr, Integer> {

}
