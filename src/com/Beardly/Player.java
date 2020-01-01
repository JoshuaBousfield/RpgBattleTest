package com.Beardly;

public class Player {
    private String name;
    private int health;
    private Armour armour;
    private Weapon weapon;
    private int atk;
    private int def;
    private boolean defend;

    public Player(String name, int health, Armour armour, Weapon weapon, int atk, int def) {
        this.name = name;
        this.health = health;
        this.armour = armour;
        this.weapon = weapon;
        this.atk = atk;
        this.def = def;
    }
//make this have more meaning
    public int attack(int attackRoll) {
        int damage = attackRoll;
        System.out.println("Atacking for " + damage + " damage");
        return damage;
    }

    public void defend() {
        System.out.println("Stance set to defend");
        this.defend = true;
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
