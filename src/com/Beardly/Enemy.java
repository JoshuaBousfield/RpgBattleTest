package com.Beardly;
//TODO create monster specific attacks using overridden methods
public class Enemy {
    private String name;
    private int health;
    private Armour armour;
    private Weapon weapon;

    public Enemy(String name, int health, Armour armour, Weapon weapon) {
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

class Goblin extends Enemy {
    public Goblin() {
        super("Goblin", 26, new GoblinLeather(), new Spear());
    }
}

class Slime extends Enemy {
    public Slime() {
        super("Slime", 8, new NoArmour(), new NoWeapon());
    }
}

class Bat extends Enemy {
    public Bat() {
        super("Bat", 11, new NoArmour(), new Claws());
    }
}

class Kobolt extends Enemy {
    public Kobolt() {
        super("Kobolt", 29, new Leather(), new Sword());
    }
}

class Boar extends Enemy {
    public Boar() {
        super("Boar", 20, new HardenedSkin(), new Claws());
    }
}
