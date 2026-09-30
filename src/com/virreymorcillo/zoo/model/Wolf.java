package com.virreymorcillo.zoo.model;

public class Wolf extends Animal{
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("makenoise");
    }
}
