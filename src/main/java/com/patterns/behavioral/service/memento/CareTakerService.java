package com.patterns.behavioral.service.memento;

/**
 * Caretaker from memento pattern
 * Saves and restores the item.
 *
 * Where
 * T - is an entity,
 * M - is the saved copy of entity
 */
public interface CareTakerService<T, M> {

    /**
     * Save the state
     */
    void setState(T src);

    /**
     * Look at the last saved state
     */
    M getLastState(T src);

    /**
     * Get the list of saved entity copies
     */
    Iterable<M> getStates(T src);

    /**
     * Restores the previous state of an entity
     */
    void restore(T src);
}
