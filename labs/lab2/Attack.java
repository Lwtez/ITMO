import ru.ifmo.se.pokemon.*;


class SandAttack extends StatusMove{
    protected SandAttack(double pow, double acc){
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

class Slash extends PhysicalMove{
    protected Slash (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected String describe(){
        return "Наносит Slash!";
    }
}

class Peck extends PhysicalMove{
    protected Peck  (double pow, double acc){
        super(Type.FLYING, pow, acc);
    }
    @Override
    protected String describe(){
        return "Использует Peck!";
    }
}

class AirSlash extends SpecialMove{
    protected AirSlash(double pow, double acc){
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

class StoneEdge extends PhysicalMove{
    protected StoneEdge(double pow, double acc){
        super(Type.ROCK, pow, acc);
    }
    @Override
    protected String describe(){
        return "Проводит Stone Edge!";
    }
}

class Tackle  extends PhysicalMove{
    protected Tackle (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected String describe(){
        return "Наносит Ice fang!";
    }
}

class IronDefense extends StatusMove{
    protected IronDefense(double pow, double acc){
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

class SludgeBomb  extends SpecialMove{
    protected SludgeBomb (double pow, double acc){
        super(Type.POISON, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon p){
        super.applyOppDamage(p);
        Effect EffectObj = new Effect().chance(0.3);
        EffectObj.poison(p);
        
    }
    @Override
    protected String describe(){
        return "Отравляет оппонента!";
    }
}

class Venoshock  extends SpecialMove{
    protected Venoshock (double pow, double acc){
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

class RockPolish  extends StatusMove{
    protected RockPolish (double pow, double acc){
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

class Absorb extends SpecialMove{
    protected Absorb  (double pow, double acc){
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

class DoubleTeam extends StatusMove{
    protected DoubleTeam  (double pow, double acc){
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