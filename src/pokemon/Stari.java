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
public class Stari extends Pokemon{
    public Stari(){
        pointsVie = 30;
        pointsAttaque = 45;
        pointsDefense = 55;
        pointsAttaqueSpe = 70;
        pointsDefenseSpe = 55;
        pointsVitesse = 85;
        type.add("eau");
        evolution = 30;
        suite = new Staross();
    }
}
