package com.patterns.behavioral.runner;

import com.patterns.behavioral.domain.memento.Item;
import com.patterns.behavioral.domain.memento.MementoOrder;
import com.patterns.behavioral.domain.memento.Order;
import com.patterns.behavioral.enums.DocumentStateType;
import com.patterns.behavioral.service.memento.CareTakerService;
import com.patterns.behavioral.service.memento.OrderService;
import com.patterns.behavioral.service.state.DocumentService;
import com.patterns.behavioral.service.state.DocumentStateContextService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class MementoRunner implements CommandLineRunner {

    private final OrderService orderService;
    private final CareTakerService<Order, MementoOrder> orderMementoService;

    @Override
    public void run(String... args) throws Exception {
        log.info("--------- Memento example: ---------");
        log.info("Step 1: creating orders");

        var item1 = new Item("flash card", BigDecimal.valueOf(500));
        var item2 = new Item("teddy bear", BigDecimal.valueOf(999));

        var order1 = new Order(new ArrayList<>(List.of(item1, item2)), UUID.randomUUID());

        var item11 = new Item("Lego", BigDecimal.valueOf(1200));
        var item12 = new Item("paits", BigDecimal.valueOf(300));

        var order2 = new Order(new ArrayList<>(List.of(item11, item12)), UUID.randomUUID());

        log.info("Created Order 1: {}", order1);
        log.info("Order1 consist of: {}", order1.getItems().toString());
        log.info("Created Order 2: {}", order2);
        log.info("Order2 consist of: {}", order2.getItems().toString());

        log.info("Step 2: saving order's states");
        orderMementoService.setState(order1);
        orderMementoService.setState(order2);
        log.info("States of order1: {}", orderMementoService.getStates(order1));
        log.info("States of order2: {}", orderMementoService.getStates(order2));

        log.info("Step 3: changing order's contents");
        order1.getItems().forEach(item -> item.setPrice(BigDecimal.valueOf(1000)));
        order2.setItems(List.of(item12));

        log.info("New state of order 1: {}", order1.getItems().toString());
        log.info("New state of order 2: {}", order2.getItems().toString());

        log.info("Step 4: restore order's states");
        orderService.restoreOrder(order1);
        orderService.restoreOrder(order2);

        log.info("Restored state of order 1: {}", order1.getItems().toString());
        log.info("Restored state of order 2: {}", order2.getItems().toString());

        log.info("Step 5: check that storage doesn't store already removed previuos state");
        log.info("States of order1: {}", orderMementoService.getStates(order1));
        log.info("States of order2: {}", orderMementoService.getStates(order2));
    }
}
