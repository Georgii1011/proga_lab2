package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.AncientPower;
import skills.Confide;
import skills.Sharpen;
import skills.StoneEdge;

public class Carbink extends Pokemon {
    public Carbink(String name, int level){
        super(name, level);
        setStats(50,50,150,50,150,50);
        setType(Type.ROCK,Type.FAIRY);
        setMove(new StoneEdge(),new AncientPower(), new Sharpen(), new Confide());
    }


}
