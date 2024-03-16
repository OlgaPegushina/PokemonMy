package MoveMy;
//сделано

import ru.ifmo.se.pokemon.*;

public class StatusMoveSwagger extends StatusMove {
    public StatusMoveSwagger() {
        super(Type.NORMAL, 0.00, 85.00);
    }

    @Override
    protected String describe() {
        return "применяет статусную атаку Swagger";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect.confuse(opp);
        Effect e = new Effect().stat(Stat.ATTACK, 2);
        opp.addEffect(e);

    }


}
