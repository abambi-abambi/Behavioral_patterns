package com.patterns.behavioral.runner;

import com.patterns.behavioral.domain.templateMethod.Account;
import com.patterns.behavioral.service.templateMethod.MaxComissionService;
import com.patterns.behavioral.service.templateMethod.MinComissionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
@RequiredArgsConstructor
public class TemplateMethodRunner implements CommandLineRunner {

    private final MaxComissionService maxComissionService;
    private final MinComissionService minComissionService;
    @Override
    public void run(String... args) throws Exception {
        log.info("--------- Template Method example ---------");

        var account1 = new Account(new BigDecimal(200));
        var account2 = new Account(new BigDecimal(121));

        minComissionService.executionOperation(account1);
        maxComissionService.executionOperation(account2);
    }
}
