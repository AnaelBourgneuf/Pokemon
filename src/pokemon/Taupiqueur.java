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
public class Taupiqueur extends Pokemon{
    public Taupiqueur(){
        pointsVie = 10;
        pointsAttaque = 55;
        pointsDefense = 25;
        pointsAttaqueSpe = 35;
        pointsDefenseSpe = 45;
        pointsVitesse = 95;
        type.add("sol");
        evolution = 26;
        suite = new Triopikeur();
    }
}
