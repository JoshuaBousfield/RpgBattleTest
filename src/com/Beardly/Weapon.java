package com.Beardly;

public class Weapon extends Item {
    private int damage;

    public Weapon(String name, int value, int damage) {
        super("Weapon", name, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}

class Sword extends Weapon {
    public Sword() {
        super("Sword", 5, 6);
    }
}

class Spear extends Weapon {
    public Spear() {
        super("Spear",5, 6);
    }
}

class Claws extends Weapon {
    public Claws() {
        super("Claws",2, 4);
    }
}

class Dagger extends Weapon {
    public Dagger() {
        super("Dagger", 3,5);
    }
}

class NoWeapon extends Weapon {
    public NoWeapon() {
        super("Empty",0, 3);
    }
}
