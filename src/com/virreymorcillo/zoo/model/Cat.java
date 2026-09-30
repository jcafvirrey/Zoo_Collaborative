package com.virreymorcillo.zoo.model;

public class Cat extends Animal implements Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void play() {
        System.out.println("Cat.play");
    }
}
