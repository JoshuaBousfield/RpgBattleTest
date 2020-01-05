package com.Beardly;
//add way for having the stats of the item, maybe in the way of a modify as in modifier = atk etc.
public class Item {
    private String type;
    private String name;
    private int value;
    private String equipmentSlot;

    public Item(String type, String name, int value, String equipmentSlot) {
        this.type = type;
        this.name = name;
        this.value = value;
        this.equipmentSlot = equipmentSlot;
    }

    public String getEquipmentSlot() {
        return equipmentSlot;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
