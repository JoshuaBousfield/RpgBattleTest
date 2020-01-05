package com.Beardly;

public class JewelItem extends Item {
    public JewelItem(String name, int value, String equipmentSlot) {
        super("Jewel", name, value, equipmentSlot);
    }
}

class Ring extends JewelItem {
    public Ring() {
        super("Ring", 15, "ring");
    }
}

class Amulet extends JewelItem {
    public Amulet() {
        super("Amulet", 20, "amulet");
    }
}
