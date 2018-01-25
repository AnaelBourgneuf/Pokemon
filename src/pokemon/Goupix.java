/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Anael
 */
public class Goupix extends Pokemon{
    public Goupix(){
        pointsVie = 38;
        pointsAttaque = 41;
        pointsDefense = 40;
        pointsAttaqueSpe = 50;
        pointsDefenseSpe = 65;
        pointsVitesse = 65;
        type.add("feu");
        evolution = 30;
        suite = new Feunard();
    }
}
