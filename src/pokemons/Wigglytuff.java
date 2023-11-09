package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.DefenseCurl;
import skills.PlayNice;
import skills.Swagger;
import skills.WorkUp;

public class Wigglytuff extends Pokemon {
    public Wigglytuff(String name, int level){
        super(name, level);
        setStats(140,70,45,85,50,45);
        setType(Type.NORMAL,Type.FAIRY);
        setMove(new WorkUp(),new DefenseCurl(), new PlayNice(), new Swagger());
    }
}
