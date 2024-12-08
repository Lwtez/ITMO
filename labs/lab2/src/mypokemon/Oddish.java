package lab2.src.mypokemon;
import ru.ifmo.se.pokemon.*;
import lab2.src.myattack.Oddish.*;

public class Oddish extends Pokemon{
    public Oddish(String name, int level){
        super(name, level);
        super.setStats(45, 50, 55, 75, 65, 30);
        setType(Type.GRASS, Type.POISON);
        setMove(new SludgeBomb(90, 100), new Venoshock(65, 100));
    }
}
