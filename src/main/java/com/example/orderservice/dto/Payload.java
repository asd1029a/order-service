package com.example.orderservice.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Payload.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.16
 */
@Data
@Builder
public class Payload {
    private String order_id;
    private String user_id;
    private String product_id;
    private int stock;
    private int unit_price;
    private int total_price;

}
