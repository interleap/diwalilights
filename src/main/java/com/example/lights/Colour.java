package com.example.lights;

public enum Colour {
    RED("\u001B[31m"), GREEN("\u001B[32m"), BLUE("\u001B[34m");

    String ansiCode;

    Colour(String ansiCode) {
        this.ansiCode = ansiCode;
    }
}
