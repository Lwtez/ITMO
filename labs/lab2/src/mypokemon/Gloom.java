package lab2.src.mypokemon;
import ru.ifmo.se.pokemon.*;
import lab2.src.myattack.Gloom.*;


public class Gloom extends Pokemon{
    public Gloom(String name, int level){
        super(name, level);
        super.setStats(60, 65, 70, 85, 75, 40);
        setType(Type.GRASS, Type.POISON);
        setMove(new SludgeBomb(90, 100), new Venoshock(65, 100), new Absorb(20, 100));
    }
}
