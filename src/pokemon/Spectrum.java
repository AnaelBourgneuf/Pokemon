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
public class Spectrum extends Pokemon{
    public Spectrum(){
        pointsVie = 45;
        pointsAttaque = 50;
        pointsDefense = 45;
        pointsAttaqueSpe = 115;
        pointsDefenseSpe = 55;
        pointsVitesse = 95;
        type.add("spectre");
        type.add("poison");
        evolution = 50;
        suite = new Ectoplasma();
    }
}
