package lab2.src.myattack.Farfetch;

import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove{
    public SandAttack(double pow, double acc){
        super(Type.GROUND, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect EffectObj = new Effect();
        EffectObj.stat(Stat.ACCURACY, -1);
    }
    @Override
    protected String describe(){
        return "Пускает пыль в глаза!";
    }

}