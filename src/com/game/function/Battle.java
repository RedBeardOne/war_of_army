package com.game.function;

import com.game.character.Warrior;


public class Battle {
    public boolean fight(Warrior warriorOne, Warrior warriorTwo) {
        while (warriorOne.isAlive() && warriorTwo.isAlive()) {
            warriorTwo.damage(warriorOne);
            if (warriorTwo.isAlive()) {
                warriorOne.damage(warriorTwo);
            }
        }
        return warriorOne.isAlive();
    }

    public boolean armyFight(Army one, Army two) {
        Battle battle = new Battle();
        while (one.isArmyAlive() && two.isArmyAlive()) {
            var wOne = one.getWarrior();
            if (wOne.isEmpty()) {
                return false;
            }
            var wTwo = two.getWarrior();
            if (wTwo.isEmpty()) {
                return false;
            }
            battle.fight(wOne.get(), wTwo.get());
        }
        return one.isArmyAlive();
    }
}


