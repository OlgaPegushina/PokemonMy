package MoveMy;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class SpecialMoveThunderShock extends SpecialMove {
    public SpecialMoveThunderShock() {
        super(Type.ELECTRIC, 40, 100);
    }

    @Override
    protected String describe() {
        return "применяет специальную атаку Thunder Shock";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().chance(0.1);
        if (effect.success()) {
            Effect.paralyze(p);
        }
    }
}
