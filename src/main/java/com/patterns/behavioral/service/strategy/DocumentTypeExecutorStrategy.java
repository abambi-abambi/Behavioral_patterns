package com.patterns.behavioral.service.strategy;

import com.patterns.behavioral.domain.strategy.Document;
import com.patterns.behavioral.enums.DocumentType;

/**
 * Accepting document according to strategy pattern
 */
public interface DocumentTypeExecutorStrategy {

    /**
     * Choose the document type which the certain strategy can work with
     */
    DocumentType getDocumentType();

    /**
     * Take and manage the document
     */
    void accept(Document document);
}
