package com.game.character;

public class Warrior {
    private static int defaultAttack = 5;
    private int health;


    protected Warrior(int health) {
        this.health = health;
    }

    public Warrior() {
        this.health = 50;
    }

    public static Warrior create(String clazz) {
        return switch (clazz) {
            case "Rookie" -> new Rookie();
            case "Warrior" -> new Warrior();
            case "Knight" -> new Knight();
            case "Defender" -> new Defender();
            case "Vampire" -> new Vampire();
            default -> throw new IllegalStateException("Unexpected value: " + clazz);
        };
    }

    protected int getDefence() {
        return 0;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    protected int getAttack() {
        return defaultAttack;
    }

    public void damageFrom(Warrior warrior) {
        var warriorAttack = warrior.getAttack();
        var defenderHealth = getHealth();
        setHealth(defenderHealth - warriorAttack);
    }

    protected void setHealth(int health) {
        this.health = health;
    }
}
