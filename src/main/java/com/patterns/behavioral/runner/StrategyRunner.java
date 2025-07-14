package com.patterns.behavioral.runner;

import com.patterns.behavioral.domain.strategy.Document;
import com.patterns.behavioral.enums.DocumentStateType;
import com.patterns.behavioral.enums.DocumentType;
import com.patterns.behavioral.service.state.DocumentService;
import com.patterns.behavioral.service.state.DocumentStateContextService;
import com.patterns.behavioral.service.strategy.DocumentExecutorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class StrategyRunner implements CommandLineRunner {

    private final DocumentExecutorService documentExecutorService;
    @Override
    public void run(String... args) throws Exception {
        log.info("--------- Strategy example ---------");

        var infoDoc = new Document("Instructions for water boiler", DocumentType.INFORMATION_DOC_TYPE);
        var secretDoc = new Document("Secret instructions for water boiler", DocumentType.SECRET_DOC_TYPE);
        var emptyDoc = new Document("Empty content", DocumentType.EMPTY_DOC_TYPE);

        documentExecutorService.accept(infoDoc);
        documentExecutorService.accept(secretDoc);
        documentExecutorService.accept(emptyDoc);

    }
}
