package com.patterns.behavioral.service.strategy;

import com.patterns.behavioral.domain.strategy.Document;

/**
 * Service for operations with documents
 */
public interface DocumentExecutorService {

    void accept(Document document);
}
