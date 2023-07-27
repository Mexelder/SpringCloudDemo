package org.tribut.service.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tribut.service.order.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
