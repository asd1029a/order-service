package com.example.orderservice.vo;

import lombok.Data;

/**
 * RequestOrder.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.03
 */
@Data
public class RequestOrder {

    private String productId;
    private Integer stock;
    private Integer unitPrice;
}
