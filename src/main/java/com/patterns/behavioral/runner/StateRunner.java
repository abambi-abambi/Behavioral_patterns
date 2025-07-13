package com.patterns.behavioral.runner;

import com.patterns.behavioral.enums.DocumentStateType;
import com.patterns.behavioral.service.mediator.SaladServiceMediator;
import com.patterns.behavioral.service.state.DocumentService;
import com.patterns.behavioral.service.state.DocumentStateContextService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class StateRunner implements CommandLineRunner {

    private final DocumentService documentService;
    private final DocumentStateContextService documentStateContextService;

    @Override
    public void run(String... args) throws Exception {
        log.info("--------- State example ---------");

        var document = documentService.create("wishList");

        documentStateContextService.doWork(document, DocumentStateType.IN_WORK);
        documentStateContextService.doWork(document, DocumentStateType.COMPLETED);
        documentStateContextService.doWork(document, DocumentStateType.NEW);
    }
}
