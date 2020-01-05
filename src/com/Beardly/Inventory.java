package com.Beardly;
//TODO add a way for armour and weapons to be added into the inventory system
public class Inventory {
    private Item item;

    public Inventory(Item item) {
        this.item = item;
    }

    public static Inventory addItem(Item item) {
        return new Inventory(item);
    }

    public Item getItem() {
        return item;
    }
}
