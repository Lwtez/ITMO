package lab2.src.myattack.Bergmite;
import ru.ifmo.se.pokemon.*;

public class RockPolish  extends StatusMove{
    public RockPolish (double pow, double acc){
        super(Type.ROCK, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect EffectObj = new Effect();
        EffectObj.stat(Stat.SPEED, +2);
        
    }
    @Override
    protected String describe(){
        return "Ускоряется";
    }
}
