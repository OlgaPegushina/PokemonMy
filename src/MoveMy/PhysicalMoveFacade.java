package MoveMy;
//сделано

import ru.ifmo.se.pokemon.*;

public class PhysicalMoveFacade extends PhysicalMove {
    public PhysicalMoveFacade() {
        super(Type.NORMAL, 70.00, 100.00);
    }

    protected String describe() {
        return "применяет физическую атаку Facade";
    }


    private void attackX2(Pokemon self, Pokemon opp) {
        boolean statusOpp = false;
        Status condition = opp.getCondition();
        if (condition == Status.BURN || condition == Status.PARALYZE || condition == Status.POISON) {
            statusOpp = true;
        }
        if (statusOpp) {
            Effect e = new Effect();
            e.stat(Stat.ATTACK, 2).turns(0);
            self.addEffect(e);
        }

    }

    @Override
    protected double calcBaseDamage(Pokemon self, Pokemon opp) {
        attackX2(self, opp);
        return super.calcBaseDamage(self, opp);
    }
}
