package com.patterns.behavioral.service.chainOfResponsibility.validator;

import com.patterns.behavioral.domain.Salad;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Order(1)
@Slf4j
@Component
public class FirstValidatorChain implements ValidatorChain<Salad> {

    @Validated
    @Override
    public void validate(Salad salad) {
        log.info("Some validation through hibernate validator");
    }
}
