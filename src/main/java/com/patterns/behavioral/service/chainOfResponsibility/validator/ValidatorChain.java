package com.patterns.behavioral.service.chainOfResponsibility.validator;

public interface ValidatorChain<T> {

    void validate(T object);
}
