package com.patterns.behavioral.domain.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * Order description
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractOrder {

    /**
     * Order contents: list of products, added to the ordder
     */
    private List<Item> items;
}
