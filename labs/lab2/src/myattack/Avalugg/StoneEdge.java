package lab2.src.myattack.Avalugg;
import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove{
    public StoneEdge(double pow, double acc){
        super(Type.ROCK, pow, acc);
    }
    @Override
    protected String describe(){
        return "Проводит Stone Edge!";
    }
}
