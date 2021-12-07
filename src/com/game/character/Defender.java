package com.game.character;

public class Defender extends Warrior {
    private static int defaultHealth = 60;
    private static int defaultAttack = 3;
    private static int defaultDefence = 2;

    public Defender() {
        super(defaultHealth);
    }

    @Override
    protected int getDefence() {
        return defaultDefence;
    }

    @Override
    public int getAttack() {
        return defaultAttack;
    }

    @Override
    public void damageFrom(Warrior warrior) {
        var attack = warrior.getAttack();
        var defence = getDefence();
        var health = getHealth();
        if (attack > defence) {
            setHealth(health - (attack - defence));
        }
    }
}


