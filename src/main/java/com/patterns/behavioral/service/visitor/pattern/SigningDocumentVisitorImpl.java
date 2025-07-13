package com.patterns.behavioral.service.visitor.pattern;

import com.patterns.behavioral.domain.visitor.AgreementDocument;
import com.patterns.behavioral.domain.visitor.OrderDocument;
import com.patterns.behavioral.domain.visitor.PaymentDocument;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Signing doc operation creation
 */
@Slf4j
@Service("signingDocumentVisitor")
public class SigningDocumentVisitorImpl implements Visitor {
    @Override
    public void visit(AgreementDocument doc) {
        log.info("called signing operation for document {}", doc);
    }

    @Override
    public void visit(OrderDocument doc) {
        log.info("called signing operation for document {}", doc);
    }

    @Override
    public void visit(PaymentDocument doc) {
        log.info("called signing operation for document {}", doc);
    }
}
