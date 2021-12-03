package com.game.character;

public class Defender extends Warrior {
    private static int defaultHealth = 60;
    private static int defaultAttack = 3;
    private static int defaultDefence = 2;

    public Defender() {
        super(defaultHealth);
    }

    @Override
    public void damage(Warrior warrior) {
        setHealth(getHealth() - (warrior.getAttack() - defaultDefence));
    }

    @Override
    public int getAttack() {
        return defaultAttack;
    }


}
