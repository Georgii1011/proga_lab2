package skills;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Sharpen extends StatusMove {
    public Sharpen() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe() {
        return "Использована способность Sharpen";
    }


    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED,+1);
    }
}