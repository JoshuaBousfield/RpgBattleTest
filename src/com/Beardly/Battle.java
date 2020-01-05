package com.Beardly;

import java.util.Scanner;

/*
battle sequence
choose first enemy
decide first go

 */
public class Battle {
    private Player player;
    private Enemy enemy;
    private boolean playerTurn;
    private boolean battleOn = false;
    private boolean running = false;
    private Scanner scanner = new Scanner(System.in);

    public Battle(Player player) {
        this.player = player;
    }

    private void chooseEnemy() {
        int enemy = new Dice(5, 1).diceRoll();
        switch (enemy) {
            case 1: this.enemy = new Goblin(); break;
            case 2: this.enemy = new Slime(); break;
            case 3: this.enemy = new Bat(); break;
            case 4: this.enemy = new Kobolt(); break;
            case 5: this.enemy = new Boar(); break;
        }
    }
//add method for battle initiation to keep the battleStart() readable
    public void battleStart() {
        this.running = true;
        while (running) {
            System.out.println("Rolling enemy");
            chooseEnemy();
            System.out.println("Rolling initiation");
            initiation(new Dice(2, 1).diceRoll());
            this.battleOn = true;
            //main battle loops here
            while (battleOn) {
                if (playerTurn) {
                    battlePlayerTurn();
                } else {
                    battleEnemyTurn();
                }
            }
        }
    }
//add scanner.nextLine() after inputs
    private void battlePlayerTurn() {
        System.out.println("Player Turn");
        System.out.println("1: ATK 2: DEF");
        int playerChoice = scanner.nextInt();
        switch (playerChoice) {
            case 1:
                this.enemy.takeDamage(player.attack(new Dice(player.getWeapon().getDamage(), player.getAtk()).diceRoll()));
                if (enemy.getHealth() <= 0) {
                    System.out.println("Onto the next battle");
                    this.battleOn = false;
                    break;
                }
                this.playerTurn = false;
                break;
            case 2:
                player.defend();
                this.playerTurn = false;
                break;
            default:
                System.out.println("Select a valid choice");
                break;
        }

    }

    private void battleEnemyTurn() {
        System.out.println(enemy.getName() + "'s Turn");
        player.takeDamage(enemy.attack());
        this.playerTurn = true;
    }

    private void initiation(int dice) {
        switch (dice) {
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

}
