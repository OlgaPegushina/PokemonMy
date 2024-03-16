package MoveMy;
//сделано

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class SpecialMoveThunderbolt extends SpecialMove {
    public SpecialMoveThunderbolt() {
        super(Type.ELECTRIC, 90.00, 100.00);
    }

    @Override
    protected String describe() {
        return "применяет специальную атаку Thunderbolt";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().chance(0.1);
        if (effect.success()) {
            Effect.paralyze(p);
        }

    }
}
