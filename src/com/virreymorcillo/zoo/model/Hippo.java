package com.virreymorcillo.zoo.model;

public class Hippo extends Animal{

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Sonido de hipopótamo");
    }
}
