package MoveMy;
//сделано

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PhysicalMoveAerialAce extends PhysicalMove {
    public PhysicalMoveAerialAce() {
        super(Type.FLYING, 60.00, Integer.MAX_VALUE);
    }

    @Override
    protected String describe() {
        return "применяет физическую атаку Aerial Ace";
    }

    @Override
    //атака всегда успешна, игнорирование статистики точности
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }

}
