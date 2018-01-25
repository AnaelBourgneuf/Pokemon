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
public class Machoc extends Pokemon{
    public Machoc(){
        pointsVie = 70;
        pointsAttaque = 80;
        pointsDefense = 50;
        pointsAttaqueSpe = 35;
        pointsDefenseSpe = 35;
        pointsVitesse = 35;
        type.add("combat");
        evolution = 28;
        suite = new Machopeur();
    }
}
