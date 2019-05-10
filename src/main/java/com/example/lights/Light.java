package com.example.lights;

import java.util.Collections;

import static com.example.lights.Colour.RED;

public abstract class Light {
    int intensity;
    Colour colour;

    public Light(){
        colour = RED;
        intensity = 5;
    }


    public abstract void next();

    public String display(){
        return colour.ansiCode+String.join("", Collections.nCopies(intensity, "|"));
    }
}
