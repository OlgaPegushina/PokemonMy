package Pokemons;

import MoveMy.PhysicalMoveFacade;

public class Raichu extends Pikachu {
    public Raichu(String name, int value) {
        super(name, value);
        super.setStats(60, 90, 55, 90, 80, 110);
        //  super.setType(Type.ELECTRIC);
        PhysicalMoveFacade attFacade2 = new PhysicalMoveFacade();
        super.addMove(attFacade2);
    }
}