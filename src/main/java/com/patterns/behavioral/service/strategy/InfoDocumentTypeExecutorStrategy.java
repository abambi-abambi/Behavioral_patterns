package com.patterns.behavioral.service.strategy;

import com.patterns.behavioral.domain.strategy.Document;
import com.patterns.behavioral.enums.DocumentType;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InfoDocumentTypeExecutorStrategy implements DocumentTypeExecutorStrategy {
    @Override
    public DocumentType getDocumentType() {
        return DocumentType.INFORMATION_DOC_TYPE;
    }

    @Override
    public void accept(Document document) {
        log.info("Accepting and working with the document of type {}", getDocumentType());
    }
}
