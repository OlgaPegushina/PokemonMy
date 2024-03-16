package Pokemons;

import MoveMy.PhysicalMoveNuzzle;

public class Pikachu extends Pichu {
    public Pikachu(String name, int value) {
        super(name, value);
        super.setStats(35, 55, 40, 50, 50, 90);
        // super.setType(Type.ELECTRIC);

        PhysicalMoveNuzzle attNuzzle = new PhysicalMoveNuzzle();
        super.addMove(attNuzzle);
    }
}