package MoveMy;
//сделано

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class PhysicalMoveDrillRun extends PhysicalMove {
    public PhysicalMoveDrillRun() {
        super(Type.GROUND, 80.00, 95.00);
    }

    protected String describe() {
        return "применяет физическую атаку Drill Run";
    }

    @Override
    protected double calcCriticalHit(Pokemon p1, Pokemon p2) {


        if (p1.getStat(Stat.SPEED) * 3 / 512.0 > Math.random()) {
            System.out.println("Нанесен критический удар");
            return 2.0;
        } else {
            System.out.println("Критический удар не сработал");
            return 1.0;
        }
    }
}
