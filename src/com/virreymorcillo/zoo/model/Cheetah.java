package com.virreymorcillo.zoo.model;

public class Cheetah extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cheetah.makeSound");
    }
    public Cheetah(String name) {
        super(name);
    }
}
