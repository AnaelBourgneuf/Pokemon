/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;

/**
 *
 * @author Dragonlord
 */
public class Dracolosse extends Pokemon{
    public Dracolosse(){
        pointsVie = 91;
        pointsAttaque = 134;
        pointsDefense = 95;
        pointsAttaqueSpe = 100;
        pointsDefenseSpe = 100;
        pointsVitesse = 80;
        type.add("dragon");
        type.add("vol");
        evolution = 30;
        suite = new Feunard();
    }
}
