package com.Players;

import com.Items.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public abstract class Player {
    public int hp;
    public int attack;
    public Collection<Item> items = new ArrayList<>();

    public String name;

    public boolean playable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPlayable() {
        return playable;
    }

    public void setPlayable(boolean playable) {
        this.playable = playable;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


}
