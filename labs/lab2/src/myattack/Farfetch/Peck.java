package lab2.src.myattack.Farfetch;
import ru.ifmo.se.pokemon.*;

public class Peck extends PhysicalMove{
    public Peck  (double pow, double acc){
        super(Type.FLYING, pow, acc);
    }
    @Override
    protected String describe(){
        return "Использует Peck!";
    }
}