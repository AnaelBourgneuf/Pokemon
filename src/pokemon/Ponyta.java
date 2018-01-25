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
public class Ponyta extends Pokemon{
    public Ponyta(){
        pointsVie = 50;
        pointsAttaque = 85;
        pointsDefense = 55;
        pointsAttaqueSpe = 65;
        pointsDefenseSpe = 65;
        pointsVitesse = 90;
        type.add("feu");
        evolution = 40;
        suite = new Galopa();
    }
}
