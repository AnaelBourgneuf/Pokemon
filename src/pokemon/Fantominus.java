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
public class Fantominus extends Pokemon{
    public Fantominus(){
        pointsVie = 30;
        pointsAttaque = 35;
        pointsDefense = 30;
        pointsAttaqueSpe = 100;
        pointsDefenseSpe = 35;
        pointsVitesse = 80;
        type.add("spectre");
        type.add("poison");
        evolution = 25;
        suite = new Spectrum();
    }
}
