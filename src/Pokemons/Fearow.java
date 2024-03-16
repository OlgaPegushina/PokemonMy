package Pokemons;

import MoveMy.PhysicalMoveDrillRun;

public class Fearow extends Spearow {

    public Fearow(String name, int value) {
        super(name, value);
        super.setStats(65, 90, 65, 61, 61, 100);
        // super.setType(Type.NORMAL, Type.FLYING);

        PhysicalMoveDrillRun attDrillRun = new PhysicalMoveDrillRun();
        super.addMove(attDrillRun);
    }
}