package com.patterns.behavioral.domain.memento;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Stores our order state
 */
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MementoOrder extends AbstractOrder {

    /**
     * Data & time for order fixed state
     */
    private LocalDateTime orderDateTime;
}
