package skills;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class PlayNice extends StatusMove {
    public PlayNice(){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected String describe(){
        return "Использована способность Play NIce";
    }


}
