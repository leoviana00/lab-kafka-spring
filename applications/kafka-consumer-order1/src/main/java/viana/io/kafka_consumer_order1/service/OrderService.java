package viana.io.kafka_consumer_order1.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

import viana.io.kafka_consumer_order1.record.OrderRecord;

@Service
public class OrderService {

    @KafkaListener(topicPartitions = @TopicPartition(topic = "lab-order-processed", partitions = { "0" }), containerFactory = "orderKafkaListenerContainerFactory")
    public void orderListener(OrderRecord order) {
        System.out.println("Received Message Consumer 01: " + order.name());
    }
}
