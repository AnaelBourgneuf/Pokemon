/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Dragonlord
 */
public class Minidraco extends Pokemon{
    public Minidraco(){
        pointsVie = 41;
        pointsAttaque = 64;
        pointsDefense = 45;
        pointsAttaqueSpe = 50;
        pointsDefenseSpe = 50;
        pointsVitesse = 50;
        type.add("dragon");
        evolution = 30;
        suite = new Draco();
    }
}
