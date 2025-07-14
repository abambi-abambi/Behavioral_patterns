package com.patterns.behavioral.domain.memento;

import lombok.Data;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Order
 */
@Data
public class Order extends AbstractOrder {

    /**
     * Order unique id
     */
    private final UUID uuid;

    public Order(List<Item> items, UUID uuid) {
        super(items);
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return Objects.equals(uuid, order.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }
}
