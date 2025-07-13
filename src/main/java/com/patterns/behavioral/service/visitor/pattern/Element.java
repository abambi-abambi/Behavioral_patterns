package com.patterns.behavioral.service.visitor.pattern;

/**
 * According to Visitor pattern
 */
public interface Element<T> {

    /**
     * an object and
     * the operation with the object
     */
    void accept(T object, Visitor visitor);
}
