package Pokemons;

import MoveMy.SpecialMoveThunderbolt;
import MoveMy.StatusMoveRest;
import MoveMy.StatusMoveSwagger;
import MoveMy.StatusMoveThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Dedenne extends Pokemon {
    public static double baseHp;

    public Dedenne(String name, int level) {
        super(name, level);
        super.setStats(67.0, 58.0, 57.0, 81.0, 67.0, 101.0);
        super.setType(Type.ELECTRIC, Type.FAIRY);

        SpecialMoveThunderbolt attThunderbolt = new SpecialMoveThunderbolt();
        StatusMoveRest attRest = new StatusMoveRest();
        StatusMoveSwagger attSwagger = new StatusMoveSwagger();
        StatusMoveThunderWave attThunderWave = new StatusMoveThunderWave();
        super.setMove(attThunderbolt, attRest, attSwagger, attThunderWave);
        baseHp = super.getHP();
    }
}