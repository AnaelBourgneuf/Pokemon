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
public class Osselait extends Pokemon{
    public Osselait(){
        pointsVie = 50;
        pointsAttaque = 50;
        pointsDefense = 95;
        pointsAttaqueSpe = 40;
        pointsDefenseSpe = 50;
        pointsVitesse = 35;
        type.add("sol");
        evolution = 28;
        suite = new Ossatueur();
    }
}
