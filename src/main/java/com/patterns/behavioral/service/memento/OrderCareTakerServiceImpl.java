package com.patterns.behavioral.service.memento;

import com.patterns.behavioral.domain.memento.Item;
import com.patterns.behavioral.domain.memento.MementoOrder;
import com.patterns.behavioral.domain.memento.Order;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@Slf4j
@Service
public class OrderCareTakerServiceImpl implements CareTakerService<Order, MementoOrder> {

    private final Map<Order, Deque<MementoOrder>> map;

    public OrderCareTakerServiceImpl() {
        this.map = new HashMap<>();
    }

    @Override
    public void setState(Order src) {
        // Optional would be appropriate
        // for null case
        var clonedItems = src.getItems().stream()
            .map(srcItem -> Item.builder()
                    .name(srcItem.getName())
                    .price(srcItem.getPrice())//BigDecimal value clone - write it yourselves
                    .build())
                .toList();

        getMemento(src).addLast(MementoOrder.builder()
                .orderDateTime(LocalDateTime.now())
                .items(clonedItems)
                .build());
    }

    @Override
    public MementoOrder getLastState(Order src) {
        return getMemento(src).peekLast();
    }

    @Override
    public Iterable<MementoOrder> getStates(Order src) {
        return getMemento(src);
    }

    @Override
    public void restore(Order src) {
        var mementoOrder = getMemento(src).pollLast();
        src.setItems(mementoOrder.getItems());
    }

    private Deque<MementoOrder> getMemento(Order src) {
        map.putIfAbsent(src, new LinkedList<>());

        return map.get(src);
    }
}
