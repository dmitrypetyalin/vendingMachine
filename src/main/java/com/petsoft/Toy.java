package com.petsoft;

/**
 * @author PetSoft
 * @date 11.05.2024 16:21
 */
public class Toy {
    private final int id;
    private static int count;
    private static int amount;
    private String name;
    private int odds;

    public Toy(String name, int odds) {
        count++;
        amount++;
        this.id = count;
        this.name = name;
        this.odds = odds;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public void reduceAmount() {
        amount--;
    }

    public String getName() {
        return name;
    }

    public float getOdds() {
        return odds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOdds(int odds) {
        this.odds = odds;
    }

    @Override
    public String toString() {
        return "Toy {" +
                "id=" + id +
                ", name='" + name +
                ", amount=" + amount +
                ", odds=" + odds + '}';
    }
}
