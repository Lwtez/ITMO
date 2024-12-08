package lab2.src.myattack.Oddish;
import ru.ifmo.se.pokemon.*;

public class Venoshock  extends SpecialMove{
    public Venoshock (double pow, double acc){
        super(Type.ICE, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon p){
        Status Pok = p.getCondition();
        if (Pok.equals(Status.POISON)) {
            p.setMod(Stat.HP, *2);
        }
        
    }
    @Override
    protected String describe(){
        return "Дует ледянным воздухом!";
    }
}
