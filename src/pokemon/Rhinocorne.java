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
public class Rhinocorne extends Pokemon{
    public Rhinocorne(){
        pointsVie = 80;
        pointsAttaque = 85;
        pointsDefense = 95;
        pointsAttaqueSpe = 30;
        pointsDefenseSpe = 30;
        pointsVitesse = 25;
        type.add("sol");
        type.add("roche");
        evolution = 42;
        suite = new Rhinoferos();
    }
}
