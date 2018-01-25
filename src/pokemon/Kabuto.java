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
public class Kabuto extends Pokemon{
    public Kabuto(){
        pointsVie = 30;
        pointsAttaque = 80;
        pointsDefense = 90;
        pointsAttaqueSpe = 55;
        pointsDefenseSpe = 45;
        pointsVitesse = 55;
        type.add("roche");
        type.add("eau");
        evolution = 40;
        suite = new Kabutops();
    }
}
