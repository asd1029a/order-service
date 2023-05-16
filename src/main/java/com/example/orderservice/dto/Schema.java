package com.example.orderservice.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Schema.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.16
 */
@Data
@Builder
public class Schema {

    private String type;
    private List<Field> fields;
    private boolean optional;
    private String name;

}
