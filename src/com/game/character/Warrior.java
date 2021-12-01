package com.game.character;

public class Warrior {
    private int health = 50;
    private static int attack = 5;

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
