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
public class Mimitoss extends Pokemon{
    public Mimitoss(){
        pointsVie = 60;
        pointsAttaque = 55;
        pointsDefense = 50;
        pointsAttaqueSpe = 40;
        pointsDefenseSpe = 55;
        pointsVitesse = 45;
        type.add("insecte");
        type.add("poison");
        evolution = 31;
        suite = new Aeromite();
    }
}
