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
public class Magicarpe extends Pokemon{
    public Magicarpe(){
        pointsVie = 20;
        pointsAttaque = 10;
        pointsDefense = 55;
        pointsAttaqueSpe = 15;
        pointsDefenseSpe = 20;
        pointsVitesse = 80;
        type.add("eau");
        evolution = 20;
        suite = new Leviator();
    }
}
