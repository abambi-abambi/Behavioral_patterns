package com.patterns.behavioral.runner;

import com.patterns.behavioral.domain.observer.Fruit;
import com.patterns.behavioral.domain.visitor.AgreementDocument;
import com.patterns.behavioral.domain.visitor.OrderDocument;
import com.patterns.behavioral.domain.visitor.PaymentDocument;
import com.patterns.behavioral.service.observer.custom.MyFruitService;
import com.patterns.behavioral.service.observer.jdk.FruitService;
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
public class ObserverRunner implements CommandLineRunner {

    private final MyFruitService customFruitService;
    private final FruitService jdkFruitService;

    @Override
    public void run(String... args) throws Exception {
        log.info("--------- Observer example ---------");

        var fruit = Fruit.builder()
                        .name("banana").build();

        log.info("--------- Custom observer example:");
        customFruitService.add(fruit);

        log.info("--------- JDK observer example:");
        jdkFruitService.add(fruit);
    }
}
