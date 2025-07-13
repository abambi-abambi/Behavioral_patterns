package com.patterns.behavioral.domain.visitor;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(callSuper = true)
public class AgreementDocument extends Document {
}
