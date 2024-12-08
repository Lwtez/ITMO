package lab2.src.myattack.Avalugg;
import ru.ifmo.se.pokemon.*;

public class IronDefense extends StatusMove{
    public IronDefense(double pow, double acc){
        super(Type.STEEL, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect EffectObj = new Effect();
        EffectObj.stat(Stat.SPECIAL_DEFENSE, +2);
        
    }
    @Override
    protected String describe(){
        return "Защищается с помощью Iron Defense";
    }
}
