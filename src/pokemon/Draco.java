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
public class Draco extends Pokemon{
    public Draco(){
        pointsVie = 61;
        pointsAttaque = 84;
        pointsDefense = 65;
        pointsAttaqueSpe = 70;
        pointsDefenseSpe = 70;
        pointsVitesse = 70;
        type.add("dragon");
        evolution = 55;
        suite = new Dracolosse();
    }
}
