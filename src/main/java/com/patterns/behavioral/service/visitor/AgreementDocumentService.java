package com.patterns.behavioral.service.visitor;

import com.patterns.behavioral.domain.visitor.AgreementDocument;
import com.patterns.behavioral.service.visitor.pattern.Element;
import com.patterns.behavioral.service.visitor.pattern.Visitor;

public interface AgreementDocumentService extends Element<AgreementDocument> {

    void add(AgreementDocument doc);

    @Override
    default void accept(AgreementDocument object, Visitor visitor) {
        visitor.visit(object);
    }
}
