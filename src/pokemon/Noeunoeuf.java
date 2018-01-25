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
public class Noeunoeuf extends Pokemon{
    public Noeunoeuf(){
        pointsVie = 60;
        pointsAttaque = 40;
        pointsDefense = 80;
        pointsAttaqueSpe = 60;
        pointsDefenseSpe = 45;
        pointsVitesse = 40;
        type.add("plante");
        type.add("psy");
        evolution = 40;
        suite = new Noadkoko();
    }
}
