package com.patterns.behavioral.runner;

import com.patterns.behavioral.domain.iterator.Fruit;
import com.patterns.behavioral.service.iterator.FruitList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Slf4j
@Component
@RequiredArgsConstructor
public class IteratorRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("--- Iterator example ---");

        var fruit1 = new Fruit("red apple", BigDecimal.valueOf(2));
        var fruit2 = new Fruit("green orange", BigDecimal.valueOf(2));
        var fruit3 = new Fruit("yellow banana", BigDecimal.valueOf(2));

        var fruitList = new FruitList(fruit1, fruit2, fruit3);

        log.info("Пройдем по элементам списка через forEach()");
        fruitList.forEach(fruit -> log.info("fruit: {}" , fruit));

        log.info("Пройдем по элементам списка через while(hasNext())");
        var fruitIterator = fruitList.iterator();
        while (fruitIterator.hasNext()) {
            log.info("fruit: {}" , fruitIterator.next());
        }
    }
}
