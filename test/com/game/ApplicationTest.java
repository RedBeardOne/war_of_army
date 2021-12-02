package com.game;

import com.game.character.Knight;
import com.game.character.Warrior;
import com.game.function.Battle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @DisplayName(" Testing warrior vs knight ")
    @Test
    void battleTestOne() {
        //arrange
        var carl = new Warrior();
        var jim = new Knight();

        //act
        Battle figth = new Battle();
        var result = figth.fight(carl, jim);

        //assert
        assertFalse(result);
    }

    @DisplayName(" Testing knight vs warrior")
    @Test
    void battleTestTwo() {
        //arrange
        var Petro = new Knight();
        var slewin = new Warrior();

        //act
        Battle figth = new Battle();
        var resultSecond = figth.fight(Petro, slewin);

        //assert
        assertTrue(resultSecond);
    }

    @DisplayName(" Testing warrior vs warriors ")
    @Test
    void battleTestThree() {
        //arrange
        var bob = new Warrior();
        var mars = new Warrior();

        //act
        Battle figth = new Battle();
        var result = figth.fight(bob, mars);

        //assert
        assertTrue(bob.isAlive());

    }

    @DisplayName(" Testing Zeus vs GodKiller")
    @Test
    void battleTestFour() {
        //arrange
        var zeus = new Knight();
        var godkiller = new Warrior();

        //act
        Battle figth = new Battle();
        var resultSecond = figth.fight(zeus, godkiller);

        //assert
        assertTrue(zeus.isAlive());
    }

    @DisplayName(" Testing husband vs wife ")
    @Test
    void battleTestFive() {
        //arrange
        var husband = new Warrior();
        var wife = new Warrior();

        //act
        Battle figth = new Battle();
        var result = figth.fight(husband, wife);

        //assert
        assertFalse(wife.isAlive());
    }

    @DisplayName(" Testing knight vs dragon ")
    @Test
    void battleTestSix() {
        //arrange
        var dragon = new Warrior();
        var knigth = new Knight();

        //act
        Battle figth = new Battle();
        var result = figth.fight(dragon, knigth);

        //assert
        assertTrue(knigth.isAlive());
    }

    @DisplayName(" Testing units ")
    @Test
    void battleTestSeven() {
        //arrange
        var unitOne = new Warrior();
        var unitTwo = new Knight();
        var unitThree = new Warrior();

        //act
        Battle figth = new Battle();
        var result = figth.fight(unitOne, unitTwo);
        System.out.println(unitOne.getHealth() + " " + unitTwo.getHealth());
        var finalBattle = figth.fight(unitTwo, unitThree);

        //assert
        assertFalse(finalBattle);

    }
}