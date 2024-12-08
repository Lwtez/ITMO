package lab2;

import ru.ifmo.se.pokemon.*;
import lab2.src.mypokemon.*;

public class MainGame{
    public static void main(String[] args) {
        Battle b = new Battle();
        Farfetch p1 = new Farfetch("Farfetch", 1);
        Bergmite p2 = new Bergmite("Bergmite", 1);
        Avalugg p3 = new Avalugg("Avalugg", 1);
        Oddish p4 = new Oddish("Oddish", 1);
        Gloom p5 = new Gloom("Gloom", 1);
        Vileplume p6 = new Vileplume("Vileplume", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
     
}