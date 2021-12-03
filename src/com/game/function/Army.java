package com.game.function;

import com.game.character.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Army{
    private List<Warrior> army = new ArrayList<>();

    public Army addUnit(Class<? extends Warrior> unit, int count) {
        for (int i = 0; i < count; i++) {
            army.add(Warrior.create(unit.getSimpleName()));
        }
        return this;
    }

    private List<Warrior> getArmy() {
        return army;
    }

    public Optional <Warrior> getWarrior() {
        return army.stream().filter(Warrior::isAlive).findFirst();
    }

    public void deathOf(Warrior warrior){
        if (!warrior.isAlive()){
            getArmy().remove(warrior);
        }
    }

    public boolean isArmyAlive(){
        for (var warrior: army){
            if (warrior.isAlive()){
                return true;
            }
        }
        return false;
    }

}
