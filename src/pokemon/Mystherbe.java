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
public class Mystherbe extends Pokemon{
    public Mystherbe(){
        pointsVie = 45;
        pointsAttaque = 50;
        pointsDefense = 55;
        pointsAttaqueSpe = 75;
        pointsDefenseSpe = 65;
        pointsVitesse = 30;
        type.add("plante");
        type.add("poison");
        evolution = 21;
        suite = new Ortide();
    }
}
