package lab2.src.mypokemon;
import ru.ifmo.se.pokemon.*;
import lab2.src.myattack.Farfetch.*;


public class Farfetch extends Pokemon{
    public Farfetch(String name, int level){
        super(name, level);
        super.setStats(52, 90, 55, 58, 62, 60);
        setType(Type.FLYING);
        setMove(new SandAttack( 0 ,100), new Slash(70, 100), new Peck(35, 100), new AirSlash(75, 95));
    }
}
