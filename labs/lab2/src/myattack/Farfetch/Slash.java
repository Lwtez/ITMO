package lab2.src.myattack.Farfetch;

import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove{
    public Slash (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected String describe(){
        return "Наносит Slash!";
    }
}