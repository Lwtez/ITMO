package lab2.src.mypokemon;
import ru.ifmo.se.pokemon.*;
import lab2.src.myattack.Bergmite.*;

public class Bergmite extends Pokemon{
    public Bergmite(String name, int level){
        super(name, level);
        super.setStats(55, 69, 85, 32, 35, 28);
        setType(Type.ICE);
        setMove(new StoneEdge(100, 80), new RockPolish(0, 100), new Tackle(40, 100));
    }
}