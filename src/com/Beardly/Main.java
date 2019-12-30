package com.Beardly;

public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle(new Player("Bob", 30, new Leather(), new Sword()), new Goblin());
        battle.battleStart();
    }
}
//TODO create opponent class, with individual monsters inheriting from that class
// create method in battle class to select a random monster to fight
// make an input for the battle for attack defend etc.
// create basic stats for the player which gain exp from defeated monsters