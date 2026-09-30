package com.virreymorcillo.zoo.app;

// Whole-package import (not one per class): this way, when a student adds
// their own class inside com.virreymorcillo.zoo.model, it is automatically
// visible here without having to touch this section.
import com.virreymorcillo.zoo.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Entry point of the collaborative exercise.
 *
 * This file CAN be modified, but ONLY on the reserved line the teacher has
 * assigned you (see the roster table). Do not touch any other line, not
 * even a classmate's, even if it is still empty, and do not add any import:
 * the import above already covers your new class.
 *
 * There are 10 reserved lines by default. If the group has more students,
 * the teacher must copy the "--- LINE N ---" block and add as many lines
 * as needed before publishing the initial repository.
 */
public class Main {
    public static void main(String[] args) {
        //prueba
        //prueba2

        List<Animal> zoo = new ArrayList<>();

        // --- LINE 1 ---


Tiger tiger = new Tiger("Vitaly");
zoo.add(tiger);
        // --- LINE 2 ---
        Animal hipopotamo = new Hippo("Jose");
        zoo.add(hipopotamo);
        // --- LINE 3 ---
        Animal cat = new Cat("Gatete miau");
        zoo.add(cat);
        // --- LINE 4 ---
        Animal Lion = new Lion("Lion") ;
        zoo.add(Lion);
        // --- LINE 5 ---
        Dog dog = new Dog("Doggi"); zoo.add(dog);

        // --- LINE 6 ---
        Animal wolf = new Wolf("Wolf");
zoo.add(wolf);
        // --- LINE 7 ---
        Animal cheetah = new Cheetah("cheetah");
        zoo.add(cheetah);
        // --- LINE 8 ---
        Monkey monito =new Monkey("El Rey");
        zoo.add(monito);

        // --- LINE 9 ---
        Animal crocodile = new Crocodrile ("Crocodile");
        zoo.add(crocodile);

        // --- LINE 10 ---


        for (Animal a : zoo) {
            a.makeSound();
            if (a instanceof Pet) {
                Pet pet = (Pet) a;
                pet.play();
            }
        }
    }
}
