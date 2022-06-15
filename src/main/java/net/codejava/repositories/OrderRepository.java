package net.codejava.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.OrderDetail;
import net.codejava.models.Orderr;


public interface OrderRepository extends JpaRepository<Orderr, Integer> {
	List<Orderr> findByAccountId(Integer accountId);
}
