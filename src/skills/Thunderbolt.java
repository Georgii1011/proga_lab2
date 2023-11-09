package skills;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC,90,100);
    }

    @Override
    protected String describe(){
        return "Испоьзована специальная атака Thunderbolt";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.1){
            Effect.paralyze(p);
        }
    }
}
