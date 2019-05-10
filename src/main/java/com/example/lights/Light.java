package com.example.lights;

import java.util.Collections;

import static com.example.lights.Colour.RED;

public class Light {
    private int intensity;
    private Colour colour;
    private Behaviour behaviour;

    public Light(Behaviour behaviour){
        this.behaviour = behaviour;
        colour = RED;
        intensity = 5;
    }

    public Light(int intensity, Colour colour) {
        this.intensity = intensity;
        this.colour = colour;
    }

    public void next(){
        Light next = behaviour.nextState(this);
        intensity = next.intensity;
        colour = next.colour;
    }

    public String display(){
        return colour.ansiCode+String.join("", Collections.nCopies(intensity, "|"));
    }

    public int getIntensity() {
        return intensity;
    }

    public Colour getColour() {
        return colour;
    }
}
