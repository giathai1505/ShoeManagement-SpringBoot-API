package net.codejava.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.CartDetail;
import net.codejava.models.OrderDetail;

public interface CartDetailRepository extends JpaRepository<CartDetail, Integer> {
	List<CartDetail> findByAccountId(Integer accountId);
}
