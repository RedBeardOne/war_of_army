package com.game;

import com.game.character.*;
import com.game.function.Army;
import com.game.function.Battle;

public class Application {
    public static void main(String[] args) {

        var jim = new Defender();
        var carl = new Rookie();
      Battle figth = new Battle();
      var result = figth.fight(jim, carl );
   //  System.out.println(result);

        var cart = new Knight();
        var cal = new Vampire();
   //   var resultTwo = figth.fight(cart, cal );

       Army myArmy = new Army();
        myArmy.addUnit(Vampire.class, 20);
        myArmy.addUnit(Knight.class, 2);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 21);
        enemyArmy.addUnit(Knight.class, 1);
        //act
        Battle figthArmy = new Battle();
        var resultArmy = figthArmy.fight(carl, jim);
        System.out.println(" Knight defender = "+resultArmy);


        resultArmy = figthArmy.fight(cart, cal);
        System.out.println(resultArmy);


        System.out.println("bAd");
        System.out.println(figthArmy.armyFight(myArmy, enemyArmy));

    }
}
