package com.virreymorcillo.zoo.model;

import com.virreymorcillo.zoo.model.Animal;
import com.virreymorcillo.zoo.model.Pet;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.InputStream;

public class Monkey extends Animal implements Pet {

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        try {
            InputStream audioSrc = getClass().getResourceAsStream("audioMono.mp3");

            if (audioSrc == null) {
                System.out.println("No se encontró el archivo de sonido: sonidoMono.wav");
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioSrc);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println(getName() + " dice: ¡Uh uh ah ah!");
        } catch (Exception e) {
            System.out.println("Error al reproducir el sonido de mono: " + e.getMessage());
        }
    }

    @Override
    public void play() {
        System.out.println(getName() + " está columpiándose en las ramas y jugando con una banana.");
    }
}