package com.pg.service;

import com.pg.dto.OrderDTO;
import com.pg.vo.OrderDetailVO;

public interface OrderService {
    public OrderDTO create(OrderDTO orderDTO);
    public OrderDetailVO findOrderDetailByOrderId(String OrderId);
    public String pay(String orderId);
}
