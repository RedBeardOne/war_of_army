package com.game.function;

import com.game.character.Warrior;

public class Battle {
    public boolean fight(Warrior warriorOne, Warrior warriorTwo) {
        while (warriorOne.isAlive() && warriorTwo.isAlive()) {
            warriorTwo.setHealth(warriorTwo.getHealth() - warriorOne.getAttack());
            if (warriorTwo.isAlive()) {
                warriorOne.setHealth(warriorOne.getHealth() - warriorTwo.getAttack());
            }
        }
        return warriorOne.isAlive();
    }
}
