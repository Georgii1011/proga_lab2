package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.DefenseCurl;
import skills.PlayNice;
import skills.WorkUp;

public class Jigglypuff extends Pokemon {
    public Jigglypuff(String name, int level){
        super(name,level);
        setMove(new WorkUp(), new DefenseCurl(), new PlayNice());
        setType(Type.NORMAL,Type.FAIRY);
        setStats(115,45,20,45,25,20);
    }
}
