package com.Beardly;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Josh");
        Inventory inventory = Inventory.addItem(new Leather());
        player.storeItem(inventory);
        player.printInventory();

        //Battle battle = new Battle(player);
        //battle.battleStart();
    }
}
//TODO create opponent class, with individual monsters inheriting from that class
// create method in battle class to select a random monster to fight
// make an input for the battle for attack defend etc.
// create basic stats for the player which gain exp from defeated monsters