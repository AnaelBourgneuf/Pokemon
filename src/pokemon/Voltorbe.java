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
public class Voltorbe extends Pokemon{
    public Voltorbe(){
        pointsVie = 40 ;
        pointsAttaque = 30;
        pointsDefense = 50;
        pointsAttaqueSpe = 55;
        pointsDefenseSpe = 55;
        pointsVitesse = 100;
        experience = 1;
        type.add("electrik");
        evolution = 30;
        suite = new Electrode();
    }
}
