package lab2.src.myattack.Avalugg;
import ru.ifmo.se.pokemon.*;

public class Tackle  extends PhysicalMove{
    public Tackle (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected String describe(){
        return "Наносит Ice fang!";
    }
}