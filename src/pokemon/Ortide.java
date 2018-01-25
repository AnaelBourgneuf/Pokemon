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
public class Ortide extends Pokemon{
    public Ortide(){
        pointsVie = 60;
        pointsAttaque = 65;
        pointsDefense = 70;
        pointsAttaqueSpe = 85;
        pointsDefenseSpe = 75;
        pointsVitesse = 40;
        type.add("plante");
        type.add("poison");
        evolution = 45;
        suite = new Rafflesia();
    }
}
