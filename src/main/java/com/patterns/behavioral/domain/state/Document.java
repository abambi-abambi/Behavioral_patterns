package com.patterns.behavioral.domain.state;

import com.patterns.behavioral.enums.DocumentStateType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Document {
    private String name;
    /**
     * State of the document
     */
    private DocumentStateType documentStateType;
}
