package skills;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PinMissile extends PhysicalMove {
    public PinMissile(){
        super(Type.BUG,25,95);
    }

    @Override
    protected String describe(){
        return "Использована физическая атака PinMissile";
    }


}
