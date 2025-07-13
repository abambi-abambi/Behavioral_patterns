package com.patterns.behavioral.runner;

import com.patterns.behavioral.domain.Vegetable;
import com.patterns.behavioral.service.chainOfResponsibility.SaladService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class ChainOfResponsibilityRunner implements CommandLineRunner {

    private final SaladService saladService;

    @Override
    public void run(String... args) throws Exception {
        log.info("--------- Chain of Responsibility example ---------");

        saladService.create("potato salad", "cut potato and place in plates", List.of(new Vegetable("yellow potato"),
                new Vegetable("violet potato")));

        saladService.create("apple salad", "bite the apple, then cut potato and place in plates", List.of(new Vegetable("yellow potato"),
                new Vegetable("violet potato")));

        try {
            saladService.create("empty salad", "find potato, then do nothing", List.of());
        } catch (Exception ex) {
            log.error("Validation error: {}", ex.getMessage());
        }
    }
}
