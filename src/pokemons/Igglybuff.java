package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.DefenseCurl;
import skills.WorkUp;

public class Igglybuff extends Pokemon {
    public Igglybuff(String name, int level){
        super(name,level);
        setMove(new WorkUp(),new DefenseCurl());
        setStats(90,30,15,40,20,15);
        setType(Type.NORMAL,Type.FAIRY);
    }
}
