package com.game.function;

import com.game.character.Warrior;


public class Battle {
    public boolean fight(Warrior warriorOne, Warrior warriorTwo) {
        while (warriorOne.isAlive() && warriorTwo.isAlive()) {
            warriorTwo.damageFrom(warriorOne);
            if (warriorTwo.isAlive()) {
                warriorOne.damageFrom(warriorTwo);
            }
        }
        return warriorOne.isAlive();
    }

    public boolean armyFight(Army one, Army two) {
        Battle battle = new Battle();
        Army army = new Army();
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
            army.deathOf(wOne.get(), one);
            army.deathOf(wTwo.get(), two);
        }
        return one.isArmyAlive();
    }
}


