package com.patterns.behavioral.service.templateMethod;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
public class MinComissionService extends AbstractCommisionService {
    @Override
    protected BigDecimal getCommisionSize() {
        return new BigDecimal(10);
    }

    @Override
    protected void printLogMessage() {
        log.info("Minimum commission mode");
    }
}
