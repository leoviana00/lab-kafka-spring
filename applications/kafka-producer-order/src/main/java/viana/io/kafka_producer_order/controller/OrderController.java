package viana.io.kafka_producer_order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import viana.io.kafka_producer_order.record.OrderRecord;
import viana.io.kafka_producer_order.service.OrderService;


@RestController
@RequestMapping("/orders")
public class OrderController {

    public final OrderService orderService;

    
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping
    public void createOrder(@RequestBody OrderRecord order){
        orderService.sendMessageOrder(order);
    }

}
