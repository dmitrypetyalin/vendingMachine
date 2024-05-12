package com.petsoft;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PetSoft
 * @date 11.05.2024 17:52
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<>(List.of(
                new Toy("Rocket", 90),
                new Toy("Robot", 80),
                new Toy("Doll", 70),
                new Toy("Teddy Bear", 60),
                new Toy("Teddy Bear", 60),
                new Toy( "Train", 50),
                new Toy( "Car", 40),
                new Toy( "Car", 40),
                new Toy( "Boat", 30),
                new Toy( "Boat", 30),
                new Toy( "Boat", 30),
                new Toy( "Ball", 20),
                new Toy( "Ball", 20),
                new Toy( "Ball", 20),
                new Toy( "Plane", 10),
                new Toy( "Plane", 10),
                new Toy( "Plane", 10),
                new Toy( "Plane", 10)));

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addToys(toys);
        vendingMachine.run();
    }
}
