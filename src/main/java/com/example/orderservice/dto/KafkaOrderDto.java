package com.example.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * KafkaOrderDto.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.16
 */
@Data
@AllArgsConstructor
public class KafkaOrderDto implements Serializable {

    private Schema schema;
    private Payload payload;
}
