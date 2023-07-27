package org.tribut.service.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tribut.service.order.dto.OrderLineItemsDto;
import org.tribut.service.order.dto.OrderRequest;
import org.tribut.service.order.mapper.OrderMapper;
import org.tribut.service.order.model.Order;
import org.tribut.service.order.model.OrderLineItems;
import org.tribut.service.order.repository.OrderRepository;

import java.util.List;

import static java.util.UUID.randomUUID;

@Service
public class OrderService {

    @Autowired
    private  OrderRepository orderRepository;
    @Autowired
    private  OrderMapper orderMapper;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(randomUUID().toString());
        List<OrderLineItems> orderLineItems = orderRequest.orderLineItemsDtoList()
                .stream()
                .map(this::mapToDto)
                .toList();
        order.setOrderLineItemsList(orderLineItems);
        orderRepository.save(order);
    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.price());
        orderLineItems.setQuantity(orderLineItemsDto.quantity());
        orderLineItems.setSkuCode(orderLineItemsDto.skuCode());
        return orderLineItems;
    }

    public List<OrderRequest> findAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream().map(orderMapper::entityToDto).toList();
    }
}
