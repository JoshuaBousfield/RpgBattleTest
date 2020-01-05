package com.Beardly;
//TODO add equipment slot for armour and possibly add class for each position
public class Armour extends Item {
    private int def;

    public Armour(String name, int value, int def) {
        super("Armour", name, value);
        this.def = def;
    }

    public int getDef() {
        return def;
    }
}

class Rags extends Armour {
    public Rags() {
        super("Rags", 2, 1);
    }
}

class Leather extends Armour {
    public Leather() {
        super("Leather",5, 6);
    }
}

class Plate extends Armour {
    public Plate() {
        super("Plate",10, 10);
    }
}

class GoblinLeather extends Armour {
    public GoblinLeather() {
        super("Goblin Leather",3, 8);
    }
}

class HardenedSkin extends Armour {
    public HardenedSkin() {
        super("Hardened Skin",0, 3);
    }
}

class NoArmour extends Armour {
    public NoArmour() {
        super("Empty",0, 0);
    }
}
