package com.Beardly;

public class Armour {
    private String name;
    private int def;

    public Armour(String name, int def) {
        this.name = name;
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public int getDef() {
        return def;
    }
}

class Rags extends Armour {
    public Rags() {
        super("Rags", 1);
    }
}

class Leather extends Armour {
    public Leather() {
        super("Leather", 6);
    }
}

class Plate extends Armour {
    public Plate() {
        super("Plate", 10);
    }
}

class GoblinLeather extends Armour {
    public GoblinLeather() {
        super("Goblin Leather", 8);
    }
}

class HardenedSkin extends Armour {
    public HardenedSkin() {
        super("Hardened Skin", 3);
    }
}

class NoArmour extends Armour {
    public NoArmour() {
        super("No Armour", 0);
    }
}
