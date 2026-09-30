package com.virreymorcillo.zoo.model;

/**
 * Base abstract class for the collaborative exercise.
 *
 * DO NOT MODIFY. Each student creates their own subclass extending Animal,
 * in a new file within this same package (com.virreymorcillo.zoo.model).
 */
public abstract class Animal {
    //Manuel Sánchez Díaz - Comentario
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method: each subclass decides how its animal sounds.
    public abstract void makeSound();
}
