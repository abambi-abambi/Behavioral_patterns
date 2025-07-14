package com.patterns.behavioral.service.strategy;

import com.patterns.behavioral.domain.strategy.Document;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Strategy pattern
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class DocumentExecutorServiceImpl implements DocumentExecutorService {

    private final List<DocumentTypeExecutorStrategy> docTypeStrategies;

    @Override
    public void accept(Document document) {
        log.info("Preparing to accepting and working with the document {}", document);

        // for study purpose do not check null cases
        docTypeStrategies.stream()
                .filter(strategy -> strategy.getDocumentType() == document.getDocumentType())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Error: didn't find strategy for this document type " + document.getDocumentType()))
                .accept(document);
    }
}
