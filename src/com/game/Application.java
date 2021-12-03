package com.game;

import com.game.character.Defender;
import com.game.character.Knight;
import com.game.character.Warrior;
import com.game.function.Army;
import com.game.function.Battle;

public class Application {
    public static void main(String[] args) {
        var carl = new Warrior();
        var jim = new Defender();

        var cart = new Warrior();
        var cal = new Warrior();

        Army myArmy = new Army();
        myArmy.addUnit(Warrior.class, 20);
        myArmy.addUnit(Knight.class, 2);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 21);
        enemyArmy.addUnit(Knight.class, 1);
        //act
        Battle figth = new Battle();
        var result = figth.fight(carl, jim);
        System.out.println(result);


        result = figth.fight(cart, cal);
        System.out.println(result);


        System.out.println("bAd");
        System.out.println(figth.armyFight(myArmy, enemyArmy));

    }
}
