package com.patterns.behavioral.service.chainOfResponsibility.validator;

import com.patterns.behavioral.domain.Salad;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(5)
@Slf4j
@Component
public class ReceiptValidatorChain implements ValidatorChain<Salad> {
    @Override
    public void validate(Salad object) {
        log.info("Some validation for potato in recipe");

        if (!object.getReceipt().matches(".*potato.*")) {
            throw new RuntimeException("Error: the receipt should contain potato");
        }
    }
}
