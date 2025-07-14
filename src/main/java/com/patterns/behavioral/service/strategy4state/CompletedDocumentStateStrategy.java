package com.patterns.behavioral.service.strategy4state;

import com.patterns.behavioral.domain.state.Document;
import com.patterns.behavioral.enums.DocumentStateType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CompletedDocumentStateStrategy implements DocumentStateStrategy {
    @Override
    public DocumentStateType getDocumentStateType() {
        return DocumentStateType.COMPLETED;
    }

    @Override
    public void doWork(Document document) {
        log.info("Fulfilling some work on a document in case changing it's state to {}", getDocumentStateType());
        //TODO some helpfull code;
    }
}
