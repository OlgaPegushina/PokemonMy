package Pokemons;

import MoveMy.PhysicalMoveFacade;
import MoveMy.SpecialMoveThunderShock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {
    public Pichu(String name, int value) {
        super(name, value);
        super.setStats(20, 40, 15, 35, 35, 60);
        super.setType(Type.ELECTRIC);

        PhysicalMoveFacade attFacade = new PhysicalMoveFacade();
        SpecialMoveThunderShock attThunderShock = new SpecialMoveThunderShock();
        super.setMove(attFacade, attThunderShock);
    }
}