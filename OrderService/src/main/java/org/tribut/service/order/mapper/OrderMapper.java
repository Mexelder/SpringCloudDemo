package org.tribut.service.order.mapper;


import org.mapstruct.Mapper;
import org.tribut.service.order.dto.OrderRequest;
import org.tribut.service.order.model.Order;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;

@Mapper(componentModel = "spring", injectionStrategy = CONSTRUCTOR)
public interface OrderMapper {
    OrderRequest entityToDto(Order order);

    Order dtoToEntity(OrderRequest orderRequest);
}
