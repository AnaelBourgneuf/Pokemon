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
public class Ramoloss extends Pokemon{
    public Ramoloss(){
        pointsVie = 90;
        pointsAttaque = 65;
        pointsDefense = 65;
        pointsAttaqueSpe = 40;
        pointsDefenseSpe = 40;
        pointsVitesse = 15;
        type.add("eau");
        type.add("psy");
        evolution = 37;
        suite = new Flagadoss();
    }
}
