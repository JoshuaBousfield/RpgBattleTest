package com.Beardly;

import java.util.ArrayList;

//TODO find a way to make slots for weapon armour etc
// find how to receive an item and assign it to a slot
// find how to communicate to the inventory to work out if an item can be equipped

//Slots: Head||Chest||Legs||Feet||Weapon||Off-hand||2 rings||Amulet
public class Equipment {
    private ArrayList<Inventory> inventory;
    private Armour head;
    private Armour chest;
    private Armour legs;
    private Armour feet;
    private Weapon mainHand;
    private Item offHand;
    private JewelItem ringOne;
    private JewelItem ringTwo;
    private JewelItem amulet;

    public Equipment() {
        this.inventory = new ArrayList<Inventory>();
        this.head = new NoArmour();
        this.chest = new Rags();
        this.legs = new NoArmour();
        this.feet = new NoArmour();
        this.mainHand = new Sword();
        this.offHand = new NoWeapon();
        this.ringOne = new Ring();
        this.ringTwo = new Ring();
        this.amulet = new Amulet();
    }

    public void printInventory() {
        for(int i=0; i<inventory.size(); i++) {
            System.out.println(inventory.get(i).getItem().getValue());
        }
    }

    public void storeItem(Inventory item) {
        inventory.add(item);
        System.out.println(item.getItem().getName() + " added to inventory");
    }

    public boolean equipItem(Item item) {

    }

    public Armour getHead() {
        return head;
    }

    public Armour getChest() {
        return chest;
    }

    public Armour getLegs() {
        return legs;
    }

    public Armour getFeet() {
        return feet;
    }

    public Weapon getMainHand() {
        return mainHand;
    }

    public Item getOffHand() {
        return offHand;
    }

    public JewelItem getRingOne() {
        return ringOne;
    }

    public JewelItem getRingTwo() {
        return ringTwo;
    }

    public JewelItem getAmulet() {
        return amulet;
    }
}
