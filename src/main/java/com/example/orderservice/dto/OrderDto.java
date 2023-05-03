package com.example.orderservice.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * OrderDto.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.03
 */
@Data
public class OrderDto implements Serializable {

    private String productId;
    private Integer stock;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;
}
