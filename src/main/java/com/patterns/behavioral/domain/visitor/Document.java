package com.patterns.behavioral.domain.visitor;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class Document {

    private String name;
}
