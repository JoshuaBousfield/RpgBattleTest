package com.Beardly;

public class Player {
    private String name;
    private int health;
    private Armour armour;
    private Weapon weapon;
    private int atk;
    private int def;

    public Player(String name, int health, Armour armour, Weapon weapon, int atk, int def) {
        this.name = name;
        this.health = health;
        this.armour = armour;
        this.weapon = weapon;
        this.atk = atk;
        this.def = def;
    }

    public void takeDamage(int damage) {
        System.out.println(damage + " damage taken");
        this.health += damage;
        if (this.health <= 0) {
            System.out.println("You died");
        }
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

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
}
