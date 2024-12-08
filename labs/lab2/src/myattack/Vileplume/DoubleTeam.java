package lab2.src.myattack.Vileplume;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam  (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }    
    
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect EffectObj = new Effect();
        EffectObj.stat(Stat.EVASION, +1);
    }
    @Override
    protected String describe(){
        return "Уклоняется от ударов!";
    }
}
