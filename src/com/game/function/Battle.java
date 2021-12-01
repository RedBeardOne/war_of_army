package com.game.function;

import com.game.character.Warrior;

public class Battle {
    public boolean fight(Warrior warriorOne, Warrior warriorTwo) {
        while (warriorOne.isAlive() && warriorTwo.isAlive()) {
            warriorTwo.getDamage(warriorOne);
            if (warriorTwo.isAlive()) {
                warriorOne.getDamage(warriorTwo);
            }
        }
        return warriorOne.isAlive();
    }
}
