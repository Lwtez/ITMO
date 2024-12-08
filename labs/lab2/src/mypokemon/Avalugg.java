package lab2.src.mypokemon;
import ru.ifmo.se.pokemon.*;
import lab2.src.myattack.Avalugg.*;


public class Avalugg extends Pokemon{
    public Avalugg(String name, int level){
        super(name, level);
        super.setStats(95, 117, 184, 44, 46, 28);
        setType(Type.ICE);
        setMove(new StoneEdge(100, 80), new RockPolish(0, 100), new Tackle(40, 100), new IronDefense(0, 100));
    }
}
