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
public class Hypotrempe extends Pokemon{
    public Hypotrempe(){
        pointsVie = 30;
        pointsAttaque = 40;
        pointsDefense = 70;
        pointsAttaqueSpe = 70;
        pointsDefenseSpe = 25;
        pointsVitesse = 60;
        type.add("eau");
        evolution = 32;
        suite = new Hypocean();
    }
}
