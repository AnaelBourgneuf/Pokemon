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
public class Machopeur extends Pokemon{
    public Machopeur(){
        pointsVie = 80;
        pointsAttaque = 100;
        pointsDefense = 70;
        pointsAttaqueSpe = 50;
        pointsDefenseSpe = 60;
        pointsVitesse = 45;
        type.add("combat");
        evolution = 60;
        suite = new Mackogneur();
    }
}
