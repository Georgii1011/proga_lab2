package skills;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DefenseCurl extends SpecialMove {
    public DefenseCurl(){
        super(Type.NORMAL, 0,0);
    }

    @Override
    protected String describe(){
        return "Использована специальная атака Defense Curl";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.DEFENSE,+1);
    }
}
