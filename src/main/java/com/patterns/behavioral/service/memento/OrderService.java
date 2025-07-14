package com.patterns.behavioral.service.memento;

import com.patterns.behavioral.domain.memento.MementoOrder;
import com.patterns.behavioral.domain.memento.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CareTakerService<Order, MementoOrder> mementoOrderService;

    // TODO typical method to work with some order

    public void restoreOrder(Order src) {
        mementoOrderService.restore(src);
    }
}
