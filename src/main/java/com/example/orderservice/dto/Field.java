package com.example.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Field.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.16
 */
@Data
@AllArgsConstructor
public class Field {
    private String type;
    private boolean optional;
    private String field;
}
