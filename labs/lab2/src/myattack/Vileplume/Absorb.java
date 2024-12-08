package lab2.src.myattack.Vileplume;
import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove{
    public Absorb  (double pow, double acc){
        super(Type.GRASS, pow, acc);
    }    
    
    @Override
    protected void applySelfDamage(Pokemon p){
        super.applySelfDamage(p);
        Effect EffectObj = new Effect();
        EffectObj.stat(Stat.HP, 1.5*p.getHP());
    }
    @Override
    protected String describe(){
        return "Восстанавливает здоровье!";
    }
}