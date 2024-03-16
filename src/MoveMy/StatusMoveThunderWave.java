package MoveMy;
//сделано

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class StatusMoveThunderWave extends StatusMove {
    public StatusMoveThunderWave() {
        super(Type.ELECTRIC, 0.00, 90.00);
    }

    @Override
    protected String describe() {
        return "применяет статусную атаку Thunder Wave";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
    }

}
