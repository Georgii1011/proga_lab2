package skills;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce(){
        super(Type.FLYING,60, Double.POSITIVE_INFINITY);
    }


    @Override
    protected String describe(){
        return "Использована физическая атака AerialAce";
    }

    
}
