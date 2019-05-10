package com.example.lights;

public class IntensityVariation implements Behaviour {

    private int change = -1;

    @Override
    public Light nextState(Light current) {
        int intensity = current.getIntensity();
        if(change < 0 && intensity == 0)
            change *= -1;
        if(change >0 && intensity == 5)
            change *= -1;

        intensity += change;
        return new Light(intensity, current.getColour());

    }
}
