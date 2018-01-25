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
public class Magneti extends Pokemon{
    public Magneti(){
        pointsVie = 25;
        pointsAttaque = 35;
        pointsDefense = 70;
        pointsAttaqueSpe = 95;
        pointsDefenseSpe = 55;
        pointsVitesse = 45;
        type.add("electrik");
        type.add("acier");
        evolution = 30;
        suite = new Magneton();
    }
}
