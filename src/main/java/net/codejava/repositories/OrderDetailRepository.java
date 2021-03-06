package net.codejava.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.codejava.models.OrderDetail;
import net.codejava.models.ProductRevenue;


@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
	List<OrderDetail> findByOrderId(Integer orderId);
	
	@Query("SELECT productId, SUM(productQuanity) as productQuantity FROM OrderDetail WHERE orderId IN :orderIds GROUP BY(productId) ")
	List<ProductRevenue> findByListOrderId(@Param("orderIds") Object orderIds);
}
