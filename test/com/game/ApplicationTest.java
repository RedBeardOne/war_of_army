package com.game;

import com.game.character.Defender;
import com.game.character.Knight;
import com.game.character.Warrior;
import com.game.function.Army;
import com.game.function.Battle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @DisplayName(" Testing warrior vs two warriors ")
    @Test
    void battleTestArmyOneGit() {
        //arrange
        Army myArmy = new Army();
        myArmy.addUnit(Warrior.class, 1);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 2);


        //act
        Battle figth = new Battle();
        var result = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertFalse(result);
    }

    @DisplayName(" Testing two warriors vs three warriors ")
    @Test
    void battleTestArmyGit() {
        //arrange
        Army myArmy = new Army();
        myArmy.addUnit(Warrior.class, 2);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 3);

        //act
        Battle figth = new Battle();
        var result = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertFalse(result);
    }

    @DisplayName(" Testing 5 warriors vs 7 warriors ")
    @Test
    void battleTestArmyThreeGit() {
        //arrange
        Army myArmy = new Army();
        myArmy.addUnit(Warrior.class, 5);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 7);

        //act
        Battle figth = new Battle();
        var result = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertFalse(result);
    }

    @DisplayName(" Testing 20 warriors vs 21 warriors ")
    @Test
    void battleTestArmyFourGit() {
        //arrange
        Army myArmy = new Army();
        myArmy.addUnit(Warrior.class, 20);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 21);

        //act
        Battle figth = new Battle();
        var result = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertTrue(result);
    }

    @DisplayName(" Testing 10 warriors vs 11 warriors ")
    @Test
    void battleTestArmyFiveGit() {
        //arrange
        Army myArmy = new Army();
        myArmy.addUnit(Warrior.class, 10);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 11);

        //act
        Battle figth = new Battle();
        var result = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertTrue(result);
    }

    @DisplayName(" Testing 11 warriors vs 7 warriors ")
    @Test
    void battleTestArmySixGit() {
        //arrange
        Army myArmy = new Army();
        myArmy.addUnit(Warrior.class, 11);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 7);

        //act
        Battle figth = new Battle();
        var result = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertTrue(result);
    }

    @DisplayName(" Testing my Army vs enemy army ")
    @Test
    void battleTestArmyOneCheckio() {
        //arrange
        Army myArmy = new Army();
        myArmy.addUnit(Knight.class, 3);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 3);

        //act
        Battle figth = new Battle();
        var result = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertTrue(result);
    }

    @DisplayName(" Testing 20 Warriors & 5 Knights vs 30 Warriors ")
    @Test
    void battleTestArmyTwoCheckio() {
        //arrange
        Army myArmy = new Army();
        myArmy.addUnit(Warrior.class, 20);
        myArmy.addUnit(Knight.class, 5);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 30);

        //act
        Battle figth = new Battle();
        var result = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertFalse(result);
    }

    @DisplayName(" Testing with param")
    @ParameterizedTest
    @CsvSource({"Warrior, Warrior, true",
                "Warrior, Knight, false",
                "Warrior, Defender, false",
                "Knight, Defender, true"})
    void battleTestParam(String firstWarrior, String secondWarrior, boolean expected) {
        //arrange
        var first = Warrior.create(firstWarrior);
        var second = Warrior.create(secondWarrior);

        //act
        Battle figth = new Battle();
        var resalt = figth.fight(first, second);

        //assert
        assertEquals(expected, resalt);
    }

    @DisplayName("Added defender. Testing  army of 14 with 4")
    @ParameterizedTest
    @CsvSource({"true"})
    void battleTestArmyDefender( boolean expected) {
        //arrange
        Army myArmy = new Army();
        myArmy.addUnit(Warrior.class, 5);
        myArmy.addUnit(Defender.class, 4);
        myArmy.addUnit(Defender.class, 5);
        Army enemyArmy = new Army();
        enemyArmy.addUnit(Warrior.class, 4);

        //act
        Battle figth = new Battle();
        var resalt = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertEquals(expected, resalt);
    }

    @DisplayName("Added defender. Testing  army of 29 with 21")
    @ParameterizedTest
    @CsvSource({"true"})
    void battleTestArmyDefenderBig( boolean expected) {
        //arrange
        Army myArmy = new Army();
        Army enemyArmy = new Army();
        myArmy.addUnit(Defender.class, 5);
        myArmy.addUnit(Warrior.class, 20);
        enemyArmy.addUnit(Warrior.class, 21);
        myArmy.addUnit(Defender.class, 4);

        //act
        Battle figth = new Battle();
        var resalt = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertEquals(expected, resalt);
    }

    @DisplayName("Added defender. Testing  army of 25 with 5")
    @ParameterizedTest
    @CsvSource({"true"})
    void battleTestArmyDefenderBattle(boolean expected) {
        //arrange
        Army myArmy = new Army();
        Army enemyArmy = new Army();
        myArmy.addUnit(Warrior.class, 10);
        myArmy.addUnit(Defender.class, 5);
        enemyArmy.addUnit(Warrior.class, 5);
        myArmy.addUnit(Defender.class, 10);

        //act
        Battle figth = new Battle();
        var resalt = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertEquals(expected, resalt);
    }
    @DisplayName("Added defender. Testing  army of 4 with 5")
    @ParameterizedTest
    @CsvSource({"false"})
    void battleTestArmyDefenderSmallArmy(boolean expected) {
        //arrange
        Army myArmy = new Army();
        Army enemyArmy = new Army();
        myArmy.addUnit(Defender.class, 2);
        myArmy.addUnit(Warrior.class, 1);
        myArmy.addUnit(Defender.class, 1);
        enemyArmy.addUnit(Warrior.class, 5);
        //act
        Battle figth = new Battle();
        var resalt = figth.armyFight(myArmy, enemyArmy);

        //assert
        assertEquals(expected, resalt);
    }
}