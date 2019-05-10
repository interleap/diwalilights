package com.example.lights;

public class ColourRotation implements Behaviour {


    @Override
    public Light nextState(Light current) {
        Colour colour = current.getColour();
        Colour[] colours = Colour.values();
        colour = colours[(colour.ordinal()+1) % colours.length];
        return new Light(current.getIntensity(), colour);
    }
}
