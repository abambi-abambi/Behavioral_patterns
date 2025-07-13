package com.patterns.behavioral.runner;

import com.patterns.behavioral.domain.Vegetable;
import com.patterns.behavioral.service.chainOfResponsibility.SaladService;
import com.patterns.behavioral.service.mediator.SaladServiceMediator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class MediatorRunner implements CommandLineRunner {

    private final SaladServiceMediator saladService;

    @Override
    public void run(String... args) throws Exception {
        log.info("--------- Mediator example ---------");

        var salad = saladService.createSalad("greek salad", 3, 6);

        log.info("The salad is ready: {}", salad);
    }
}
