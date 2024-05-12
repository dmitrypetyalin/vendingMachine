package com.petsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author PetSoft
 * @date 11.05.2024 16:21
 */
public class VendingMachine {
    private List<Toy> toys;

    public VendingMachine() {
        this.toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void addToys(List<Toy> toys) {
        this.toys.addAll(toys);
    }

    public Toy lottery() {
        if (!toys.isEmpty()) {
            Random random = new Random();
            int randomInt = random.nextInt(10) * 10;
            for (Toy toy : toys) {
                if (toy.getOdds() == randomInt) {
                    Logger.writeLog(toy.toString());
                    toy.reduceAmount();
                    toys.remove(toy);
                    return toy;
                }
            }
        }
        return null;
    }

    public void run() {
        Command com;
        boolean flag = true;
        System.out.println("-------------------------- Vending machine lottery --------------------------");
        while (flag) {
            String command = prompt("Type the command (PLAY/EXIT): ");
            try {
                com = Command.valueOf(command.toUpperCase());
                switch (com) {
                    case EXIT:
                        flag = false;
                        System.out.println("Exit the lottery!");
                        break;
                    case PLAY:
                        Toy toy = lottery();
                        System.out.println(toy == null ? "You've win nothing" : "You've win " + toy.getName());
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Unreachable command!");
            }
        }
    }

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg + " ");
        return in.nextLine();
    }
}
