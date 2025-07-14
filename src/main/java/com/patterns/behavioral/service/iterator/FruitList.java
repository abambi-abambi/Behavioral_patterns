package com.patterns.behavioral.service.iterator;


import com.patterns.behavioral.domain.iterator.Fruit;

import java.util.Iterator;

public class FruitList implements Iterable<Fruit> {

    private final Fruit[] fruitArray;

    public FruitList(Fruit... fruits) {
        this.fruitArray = fruits;
    }

    @Override
    public Iterator<Fruit> iterator() {
        return new FruitListIterator();
    }

    private class FruitListIterator implements Iterator<Fruit> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < fruitArray.length;
        }

        @Override
        public Fruit next() {
            return fruitArray[index++];
        }
    }
}
