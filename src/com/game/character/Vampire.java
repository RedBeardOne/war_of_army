package com.game.character;

public class Vampire extends Warrior {
    private static int defaultHealth = 40;
    private static int defaultAttack = 4;
    private int healing = 0;


    public Vampire() {
        super(defaultHealth);
    }


    @Override
    public int getAttack() {
        setHealth(Math.min(defaultHealth, (getHealth() + healing)));
        return defaultAttack;
    }

    @Override
    public void damageFrom(Warrior warrior) {
        healing = ((defaultAttack - warrior.getDefence()) * 50) / 100;
        super.damageFrom(warrior);
    }
}

