package com.patterns.behavioral.service.mediator;

import com.patterns.behavioral.domain.Salad;
import com.patterns.behavioral.domain.Vegetable;
import com.patterns.behavioral.domain.mediator.Fruit;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Mediator pattern realization
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SaladServiceMediatorImpl implements SaladServiceMediator {

    private final FruitService fruitService;
    private final VegetableService vegetableService;

    @Override
    public Salad createSalad(String saladName, int fruitCount, int vegetableCount) {
        return Salad.builder()
                .name(saladName)
                .receipt("find it on the Internet")
                .ingredients(getIngredients(fruitCount, vegetableCount))
                .build();
    }

    private List<Object> getIngredients(int fruitCount, int vegetableCount) {
        var ingredients = new ArrayList<>();

        ingredients.addAll(getFruits(fruitCount));
        ingredients.addAll(getVegetables(vegetableCount));

        return ingredients;
    }

    private List<Vegetable> getVegetables(int vegetableCount) {
        return IntStream.range(0, vegetableCount).mapToObj(digit -> vegetableService.get()).toList();

    }

    private List<Fruit> getFruits(int fruitCount) {
        return IntStream.range(0, fruitCount).mapToObj(digit -> fruitService.get()).toList();
    }
}
