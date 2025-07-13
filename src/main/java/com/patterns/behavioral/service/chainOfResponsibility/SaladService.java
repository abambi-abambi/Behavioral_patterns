package com.patterns.behavioral.service.chainOfResponsibility;

import com.patterns.behavioral.domain.chainOfResponsibility.Salad;
import com.patterns.behavioral.domain.chainOfResponsibility.Vegetable;

import java.util.List;

/**
 * Service for making salads
 */
public interface SaladService {

    Salad create(String name, String receipt, List<Vegetable> vegetables);
}
