package com.Beardly;

public class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}

class Sword extends Weapon {
    public Sword() {
        super("Sword", 8);
    }
}

class Spear extends Weapon {
    public Spear() {
        super("Spear", 6);
    }
}

class Claws extends Weapon {
    public Claws() {
        super("Claws", 4);
    }
}

class Dagger extends Weapon {
    public Dagger() {
        super("Dagger", 5);
    }
}

class NoWeapon extends Weapon {
    public NoWeapon() {
        super("No Weapon", 3);
    }
}
