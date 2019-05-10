package com.example.lights;

public class ColouredLight extends Light{

    @Override
    public void next() {
        Colour[] colours = Colour.values();
        colour = colours[(colour.ordinal()+1) % colours.length];
    }
}
