package com.game.character;

public class Warrior {
    private int health = 50;
    private static int attack = 5;

    public static Warrior create(String clazz) {
        return switch (clazz) {
            case "Warrior" -> new Warrior();
            case "Knight" -> new Knight();
            default -> throw new IllegalStateException("Unexpected value: " + clazz);
        };
    }

    public boolean isAlive() {
        return health > 0;
    }


    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void getDamage(Warrior warrior) {
        setHealth(getHealth() - warrior.getAttack());
    }

    private void setHealth(int health) {
        this.health = health;
    }
}
