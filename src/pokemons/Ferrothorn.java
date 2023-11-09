package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.AerialAce;
import skills.PinMissile;
import skills.PoisonJab;
import skills.Thunderbolt;

public class Ferrothorn extends Pokemon {
    public Ferrothorn(String name, int level){
        super(name, level);
        setMove(new PoisonJab(), new Thunderbolt(), new PinMissile(), new AerialAce());
        setType(Type.GRASS,Type.STEEL);
        setStats(74,94,131,54,116,20);
    }
}
