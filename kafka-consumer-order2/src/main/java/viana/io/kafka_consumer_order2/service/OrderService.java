package viana.io.kafka_consumer_order2.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

import viana.io.kafka_consumer_order2.record.OrderRecord;

@Service
public class OrderService {
    @KafkaListener(topicPartitions = @TopicPartition(topic = "lab-order-processed", partitions = { "1" }), containerFactory = "orderKafkaListenerContainerFactory")
    public void orderListener(OrderRecord order) {
        System.out.println("Received Message Consumer 02: " + order.name());
    }
}
