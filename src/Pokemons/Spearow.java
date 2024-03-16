package Pokemons;

import MoveMy.PhysicalMoveAerialAce;
import MoveMy.PhysicalMoveFacade;
import MoveMy.PhysicalMovePeck;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Spearow extends Pokemon {
    public Spearow(String name, int value) {
        super(name, value);
        super.setStats(40.0, 60.0, 30.0, 31.0, 31.0, 70.0);
        super.setType(Type.NORMAL, Type.FLYING);

        PhysicalMovePeck attPeck = new PhysicalMovePeck();
        PhysicalMoveFacade attFacade = new PhysicalMoveFacade();
        PhysicalMoveAerialAce attAerialAce = new PhysicalMoveAerialAce();
        super.setMove(attPeck, attFacade, attAerialAce);
    }
}