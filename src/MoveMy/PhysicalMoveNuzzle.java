package MoveMy;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PhysicalMoveNuzzle extends PhysicalMove {
    public PhysicalMoveNuzzle() {
        super(Type.ELECTRIC, 20, 100);
    }

    @Override
    protected String describe() {
        return "применяет физическую атаку Nuzzle";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect.paralyze(opp);
    }

}
