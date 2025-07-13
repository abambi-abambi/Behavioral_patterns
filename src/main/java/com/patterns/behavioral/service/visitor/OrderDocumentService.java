package com.patterns.behavioral.service.visitor;

import com.patterns.behavioral.domain.visitor.OrderDocument;
import com.patterns.behavioral.service.visitor.pattern.Element;
import com.patterns.behavioral.service.visitor.pattern.Visitor;

public interface OrderDocumentService extends Element<OrderDocument> {

    void add(OrderDocument doc);

    @Override
    default void accept(OrderDocument object, Visitor visitor) {
        visitor.visit(object);
    }
}
