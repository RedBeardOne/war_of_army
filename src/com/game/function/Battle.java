package com.game.function;

import com.game.character.Warrior;

import java.util.List;
import java.util.function.Predicate;

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

    public boolean armyFight(Army one, Army two) {
        Battle battle = new Battle();
        Warrior wOne = null;
        Warrior wTwo = null;
        List<Warrior> armyOne = one.getArmy();
        List<Warrior> armyTwo = two.getArmy();
        while (armyOne.size() != 0 && armyTwo.size() != 0) {
            wOne = armyOne.get(0);
            wTwo = armyTwo.get(0);
            battle.fight(wOne, wTwo);
            if (!wOne.isAlive()) {
                armyOne.remove(wOne);
            } else {
                armyTwo.remove(wTwo);
                battle.fight(wOne, wTwo);
            }
        }
        System.out.println(wOne.getHealth());
        return (armyOne.size() != 0);
    }
}
