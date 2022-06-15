package net.codejava.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.CartDetail;


public interface CartDetailRepository extends JpaRepository<CartDetail, Integer> {
	List<CartDetail> findByAccountId(Integer accountId);
	 @Transactional
	Long deleteByAccountId(Integer accountId);

    List<CartDetail> removeByAccountId(Integer accountId);
}
