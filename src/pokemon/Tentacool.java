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
public class Tentacool extends Pokemon{
    public Tentacool(){
        pointsVie = 40;
        pointsAttaque = 40;
        pointsDefense = 35;
        pointsAttaqueSpe = 50;
        pointsDefenseSpe = 100;
        pointsVitesse = 70;
        type.add("eau");
        type.add("poison");
        evolution = 30;
        suite = new Tentacruel();
    }
}
