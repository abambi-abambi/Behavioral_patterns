package com.patterns.behavioral.runner;

import com.patterns.behavioral.domain.visitor.AgreementDocument;
import com.patterns.behavioral.domain.visitor.OrderDocument;
import com.patterns.behavioral.domain.visitor.PaymentDocument;
import com.patterns.behavioral.enums.DocumentStateType;
import com.patterns.behavioral.service.state.DocumentService;
import com.patterns.behavioral.service.state.DocumentStateContextService;
import com.patterns.behavioral.service.visitor.AgreementDocumentService;
import com.patterns.behavioral.service.visitor.OrderDocumentService;
import com.patterns.behavioral.service.visitor.PaymentDocumentService;
import com.patterns.behavioral.service.visitor.pattern.Visitor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class VisitorRunner implements CommandLineRunner {

    private final Visitor rejectDocumentVisitor;
    private final Visitor signingDocumentVisitor;
    private final AgreementDocumentService agreementDocumentService;
    private final OrderDocumentService orderDocumentService;
    private final PaymentDocumentService paymentDocumentService;

    @Override
    public void run(String... args) throws Exception {
        log.info("--------- Visitor example ---------");

        var agreementDoc = AgreementDocument.builder()
                .name("Agreement #2")
                .build();

        var paymentDoc = PaymentDocument.builder()
                .name("Payment #3")
                .build();

        var orderDoc = OrderDocument.builder()
                .name("Order #22")
                .build();

        agreementDocumentService.accept(agreementDoc, signingDocumentVisitor);
        agreementDocumentService.accept(agreementDoc, rejectDocumentVisitor);

        paymentDocumentService.accept(paymentDoc, signingDocumentVisitor);
        paymentDocumentService.accept(paymentDoc, rejectDocumentVisitor);

        orderDocumentService.accept(orderDoc, signingDocumentVisitor);
        orderDocumentService.accept(orderDoc, rejectDocumentVisitor);
    }
}
