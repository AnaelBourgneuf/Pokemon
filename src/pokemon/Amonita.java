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
public class Amonita extends Pokemon{
    public Amonita(){
        pointsVie = 35;
        pointsAttaque = 40;
        pointsDefense = 100;
        pointsAttaqueSpe = 90;
        pointsDefenseSpe = 55;
        pointsVitesse = 35;
        type.add("roche");
        type.add("eau");
        evolution = 40;
        suite = new Amonistar();
    }
}
