package viana.io.kafka_producer_order.service;

import java.util.Random;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import viana.io.kafka_producer_order.record.OrderRecord;

@Service
public class OrderService {

    private final KafkaTemplate<String, OrderRecord> kafkaTemplateOrder;

    private final Random random = new Random();

    public OrderService(KafkaTemplate<String, OrderRecord> kafkaTemplateOrder) {
        this.kafkaTemplateOrder = kafkaTemplateOrder;
    }

    @SuppressWarnings("null")
    public void sendMessageOrder(OrderRecord order){
        int partition = random.nextInt(2);
        System.out.println("Sent message to partition: " + partition);
        System.out.println("Sending order: " + order.name());
        kafkaTemplateOrder.send("lab-order-processed", partition, null, order);
    }

}
