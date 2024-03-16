package MoveMy;
//сделано

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PhysicalMovePeck extends PhysicalMove {
    public PhysicalMovePeck() {
        super(Type.FLYING, 35.00, 100.00);
    }

    protected String describe() {
        return "применяет физическую атаку Peck";
    }
}
