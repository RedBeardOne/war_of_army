package com.game;

import com.game.character.Knight;
import com.game.character.Warrior;
import com.game.function.Battle;

public class Application {
    public static void main(String[] args) {
        var carl = new Warrior();
        var jim = new Knight();

        //act
        Battle figth = new Battle();
        var result = figth.fight(carl, jim);
    }
}
