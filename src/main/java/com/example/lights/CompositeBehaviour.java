package com.example.lights;

public class CompositeBehaviour implements Behaviour{
    private Behaviour first, second;

    public CompositeBehaviour(Behaviour first, Behaviour second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public Light nextState(Light current) {
        Light next = first.nextState(current);
        return second.nextState(next);
    }
}
