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
public class Sablette extends Pokemon{
    public Sablette(){
        pointsVie = 50;
        pointsAttaque = 75;
        pointsDefense = 82;
        pointsAttaqueSpe = 20;
        pointsDefenseSpe = 30;
        pointsVitesse = 40;
        type.add("sol");
        evolution = 22;
        suite = new Sablaireau();
    }
}
