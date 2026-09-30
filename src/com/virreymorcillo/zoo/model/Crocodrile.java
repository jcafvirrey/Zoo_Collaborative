package com.virreymorcillo.zoo.model;

public class Crocodrile extends Animal {

    public Crocodrile(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("make sounds");
    }
}
