package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.PinMissile;
import skills.PoisonJab;
import skills.Thunderbolt;

public class Ferroseed extends Pokemon {
    public Ferroseed(String name, int level){
        super(name,level);
        setMove(new PoisonJab(), new Thunderbolt(), new PinMissile());
        setType(Type.GRASS,Type.STEEL);
        setStats(44,50,91,24,86,10);
    }
}
