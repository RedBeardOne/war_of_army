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
            case "Warrior" -> new Warrior();
            case "Knight" -> new Knight();
            case "Defender" -> new Defender();
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
        return defaultAttack;
    }

    public void damage(Warrior warrior) {
        setHealth(getHealth() - warrior.getAttack());
    }

    protected void setHealth(int health) {
        this.health = health;
    }
}
