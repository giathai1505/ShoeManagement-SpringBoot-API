package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.CartDetail;

public interface CartDetailRepository extends JpaRepository<CartDetail, Integer> {

}
