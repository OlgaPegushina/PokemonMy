package MoveMy;
//сделано

import ru.ifmo.se.pokemon.*;

import static Pokemons.Dedenne.baseHp;

public class StatusMoveRest extends StatusMove {
    public StatusMoveRest() {
        super(Type.PSYCHIC, 0.00, 100.00);
    }

    @Override
    protected String describe() {
        return "применяет статусную атаку Rest";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        //засыпает на 2 хода, восстанавливает здоровье, у меня в первый ход
        System.out.println(p.getHP());
        Effect e = new Effect();
        Effect e2 = new Effect();
        e.condition(Status.SLEEP).attack(0.0).turns(2);
        e2.stat(Stat.HP, (int) ((baseHp - p.getHP()) * (-1))).turns(1);
        p.addEffect(e);
        p.addEffect(e2);


    }
//    @Override
//    protected void applyOppEffects(Pokemon p) {
//        Effect e = new Effect().attack(0.00).turns(2);
//    }
}
