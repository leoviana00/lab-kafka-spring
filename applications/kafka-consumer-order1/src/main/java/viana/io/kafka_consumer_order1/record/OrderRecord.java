package viana.io.kafka_consumer_order1.record;

import java.math.BigDecimal;

public record OrderRecord(Long id, String name, String description, BigDecimal amount) {

}
