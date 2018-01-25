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
public class Reptincel extends Pokemon{
    public Reptincel(){
        pointsVie = 58;
        pointsAttaque = 64;
        pointsDefense = 58;
        pointsAttaqueSpe = 80;
        pointsDefenseSpe = 65;
        pointsVitesse = 80;
        type.add("feu");
        evolution = 36;
        suite = new Dracaufeu();
    }
}
