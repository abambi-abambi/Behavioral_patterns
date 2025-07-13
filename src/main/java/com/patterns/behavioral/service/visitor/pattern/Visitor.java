package com.patterns.behavioral.service.visitor.pattern;

import com.patterns.behavioral.domain.visitor.AgreementDocument;
import com.patterns.behavioral.domain.visitor.OrderDocument;
import com.patterns.behavioral.domain.visitor.PaymentDocument;

public interface Visitor {

    void visit(AgreementDocument doc);
    void visit(OrderDocument doc);
    void visit(PaymentDocument doc);
}
