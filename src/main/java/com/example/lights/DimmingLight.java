package com.example.lights;

public class DimmingLight extends Light{

    private int change = -1;

    @Override
    public void next() {
        if(change < 0 && intensity == 0)
            change *= -1;
        if(change >0 && intensity == 5)
            change *= -1;

        intensity += change;
    }
}
