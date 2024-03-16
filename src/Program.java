import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Program {
    public static void main(String[] args) {
        System.out.println("Hello start");

        Dedenne p1 = new Dedenne("Денди", 10);
        Spearow p2 = new Spearow("Грозный", 10);
        Fearow p3 = new Fearow("Глупыш", 10);
        Pichu p4 = new Pichu("Умник", 10);
        Pikachu p5 = new Pikachu("Смелый", 10);
        Raichu p6 = new Raichu("Силач", 10);

        Battle b = new Battle();

        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();

        System.out.println("\n Hello finish");
    }

}