import pokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Main {
    public static void main(String[] args) {

        Battle fight = new Battle();

        Carbink p1 = new Carbink("Мандаринка", 1);
        Ferroseed p2 = new Ferroseed("Апельсинка", 1);
        Ferrothorn p3 = new Ferrothorn("Вишенка",1);
        Igglybuff p4 = new Igglybuff("Арбузик",1);
        Jigglypuff p5 = new Jigglypuff("Бананчик",1);
        Wigglytuff p6 = new Wigglytuff("Грейфруктик",1);

        fight.addAlly(p1);
        fight.addAlly(p3);
        fight.addAlly(p5);

        fight.addFoe(p2);
        fight.addFoe(p4);
        fight.addFoe(p6);

        fight.go();
    }
}