package com.patterns.behavioral.service.state;

import com.patterns.behavioral.domain.state.Document;
import com.patterns.behavioral.enums.DocumentStateType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DocumentServiceImpl implements DocumentService {
    @Override
    public Document create(String name) {
        log.info("Document {} is created", name);
        return new Document(name, DocumentStateType.NEW);
    }
}
