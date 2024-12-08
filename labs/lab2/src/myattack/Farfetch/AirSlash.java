package lab2.src.myattack.Farfetch;
import ru.ifmo.se.pokemon.*;

public class AirSlash extends SpecialMove{
    public AirSlash(double pow, double acc){
        super(Type.FLYING, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon p){
        super.applyOppDamage(p);
        Effect EffectObj = new Effect().chance(0.3);
        EffectObj.flinch(p);
    }
    @Override
    protected String describe(){
        return "Наносит воздушный удар!";
    }
}
