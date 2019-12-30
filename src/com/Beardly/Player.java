package com.Beardly;

public class Player {
    private String name;
    private int health;
    private Armour armour;
    private Weapon weapon;

    public Player(String name, int health, Armour armour, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.armour = armour;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Armour getArmour() {
        return armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
