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
public class Poissirene extends Pokemon{
    public Poissirene(){
        pointsVie = 45;
        pointsAttaque = 67;
        pointsDefense = 60;
        pointsAttaqueSpe = 35;
        pointsDefenseSpe = 50;
        pointsVitesse = 63;
        type.add("eau");
        evolution = 33;
        suite = new Poissoroy();
    }
}
