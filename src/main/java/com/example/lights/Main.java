package com.example.lights;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Light dimmingLight = new Light(new CompositeBehaviour(new IntensityVariation(), new ColourRotation()));
        Light colouredLight = new Light(new ColourRotation());

        for (int iterator = 0; iterator < 100; iterator++) {
            System.out.println(colouredLight.display() + "\t\t" + dimmingLight.display() + "\n\n");
            dimmingLight.next();
            colouredLight.next();
            Thread.sleep(1000);
        }
    }
}
