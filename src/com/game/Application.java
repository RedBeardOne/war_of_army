package com.game;

import com.game.character.Knight;
import com.game.character.Warrior;
import com.game.function.Army;
import com.game.function.Battle;

public class Application {
    public static void main(String[] args) {
        var carl = new Warrior();
        var jim = new Knight();

        //act
        Battle figth = new Battle();
        var result = figth.fight(carl, jim);

        Army myArmy = new Army();
        myArmy.addUnit(Warrior.class, 1);
        myArmy.addUnit(Knight.class, 2);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 2);
        enemyArmy.addUnit(Knight.class, 1);
        System.out.println(figth.armyFight(myArmy, enemyArmy));

    }
}
