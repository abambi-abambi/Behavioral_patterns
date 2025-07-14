package com.patterns.behavioral.service.strategy4state;

import com.patterns.behavioral.domain.state.Document;
import com.patterns.behavioral.enums.DocumentStateType;

/**
 * Manage tha document in accordance to strategy pattern
 */
public interface DocumentStateStrategy {

    /**
     * Change to new state
     */
    DocumentStateType getDocumentStateType();

    void doWork(Document document);
}
