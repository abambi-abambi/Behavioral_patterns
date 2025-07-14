package com.patterns.behavioral.domain.strategy;


import com.patterns.behavioral.enums.DocumentType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Document {

    /**
     * Document name
     */
    private final String name;

    /**
     * Document type
     */
    private DocumentType documentType;
}
