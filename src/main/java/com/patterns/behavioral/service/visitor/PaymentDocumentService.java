package com.patterns.behavioral.service.visitor;

import com.patterns.behavioral.domain.visitor.PaymentDocument;
import com.patterns.behavioral.service.visitor.pattern.Element;
import com.patterns.behavioral.service.visitor.pattern.Visitor;

public interface PaymentDocumentService extends Element<PaymentDocument> {

    void add(PaymentDocument doc);

    @Override
    default void accept(PaymentDocument object, Visitor visitor) {
        visitor.visit(object);
    }
}
