package com.Beardly;

public class Battle {
    private Player player;
    private Enemy enemy;
    private boolean playerTurn;

    public Battle(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void battleStart() {
        int firstToGo = new Dice(2, 1).diceRoll();
        switch (firstToGo) {
            case 1:
                System.out.println("Player goes first");
                this.playerTurn = true;
                break;
            case 2:
                System.out.println("monster goes first");
                this.playerTurn = false;
                break;
        }
    }

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
