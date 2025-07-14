package com.patterns.behavioral.service.state;

import com.patterns.behavioral.domain.state.Document;
import com.patterns.behavioral.enums.DocumentStateType;
import com.patterns.behavioral.service.strategy4state.DocumentStateStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DocumentStateContextService {

    private final List<DocumentStateStrategy> documentStateStrategies;

    public void doWork(Document document, DocumentStateType nextDocumentStateType) {
       log.info("Working on document {} and changing document state from '{}' " +
               "to state '{}' ", document.getName(), document.getDocumentStateType(), nextDocumentStateType);

        getStateStrategy(nextDocumentStateType).doWork(document);
        document.setDocumentStateType(nextDocumentStateType);
    }

    private DocumentStateStrategy getStateStrategy(DocumentStateType documentStateType) {
        return documentStateStrategies.stream()
            .filter(strategy -> strategy.getDocumentStateType() == documentStateType)
                .findFirst().orElseThrow(() -> new RuntimeException("Error: document strategy is not found for type " + documentStateType));
    }

}
