package com.patterns.behavioral.domain.memento;

import com.patterns.behavioral.enums.DocumentStateType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Product
 */
@Data
@Builder
@AllArgsConstructor
public class Item {

    private String name;

    private BigDecimal price;
}
