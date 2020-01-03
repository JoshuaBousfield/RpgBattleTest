package com.Beardly;
//TODO create monster specific attacks using overridden methods
public class Enemy {
    private String name;
    private int health;
    private Armour armour;
    private Weapon weapon;
    private int atk;
    private int def;

    public Enemy(String name, int health, Armour armour, Weapon weapon, int atk, int def) {
        this.name = name;
        this.health = health;
        this.armour = armour;
        this.weapon = weapon;
        this.atk = atk;
        this.def = def;
    }

    public int attack() {
        int rollDamage = new Dice(weapon.getDamage(), Math.round(this.atk / 2)).diceRoll();
        return rollDamage;
    }

    public void takeDamage(int damage) {
        System.out.println(this.getName() + " took " + damage + " damage");
        System.out.println(this.name + ": " + this.health);
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println(this.getName() + " died");
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
//goblin attacks- charge atk, slash, defend
class Goblin extends Enemy {
    public Goblin() {
        super("Goblin", 26, new GoblinLeather(), new Spear(), 5, 2);
    }

    @Override
    public int attack() {
        return super.attack();
    }
}

class Slime extends Enemy {
    public Slime() {
        super("Slime", 8, new NoArmour(), new NoWeapon(), 3, 1);
    }
}

class Bat extends Enemy {
    public Bat() {
        super("Bat", 11, new NoArmour(), new Claws(), 3, 2);
    }
}

class Kobolt extends Enemy {
    public Kobolt() {
        super("Kobolt", 29, new Leather(), new Sword(), 5, 4);
    }
}

class Boar extends Enemy {
    public Boar() {
        super("Boar", 20, new HardenedSkin(), new Claws(), 3, 3);
    }
}
