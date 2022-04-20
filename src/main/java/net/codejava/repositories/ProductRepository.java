package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
