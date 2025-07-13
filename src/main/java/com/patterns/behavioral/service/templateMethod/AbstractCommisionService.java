package com.patterns.behavioral.service.templateMethod;

import com.patterns.behavioral.domain.templateMethod.Account;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

/**
 * Service for calculating and taking commisions
 * from client's account
 */

@Slf4j
@Validated
public abstract class AbstractCommisionService {

    /**
     * Commision size
     */
    @PositiveOrZero
    protected abstract BigDecimal getCommisionSize();

    protected abstract void printLogMessage();

    public void executionOperation(Account account){
        printLogMessage();
        log.info("Comission size is {}", getCommisionSize());
        log.info("Account balance before taking commision is {}", account.getBalance());
        account.setBalance(account.getBalance().subtract(getCommisionSize()));
        log.info("Account balance after taking commision is {}", account.getBalance());

    };
}
