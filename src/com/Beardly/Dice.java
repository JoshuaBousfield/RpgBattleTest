package com.Beardly;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int diceMax;
    private int diceMin;

    public Dice(int diceMax, int diceMin) {
        this.diceMax = diceMax;
        this.diceMin = diceMin;
    }

    public int diceRoll() {
        int diceThrow = ThreadLocalRandom.current().nextInt(this.diceMin,this.diceMax + 1);
        System.out.println("Dice roll: " + diceThrow);
        return diceThrow;
    }
}
