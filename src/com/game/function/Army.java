package com.game.function;

import com.game.character.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Army {
    public List<Warrior> getArmy() {
        return army;
    }

    private List<Warrior> army = new ArrayList<>();

    public Army addUnit(Class<? extends Warrior> unit, int count){
        for (int i = 0; i <count; i++) {
            army.add(Warrior.create(unit.getSimpleName()));
        }
        return this;
    }
}
