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
public class Roucool extends Pokemon{
    public Roucool(){
        pointsVie = 40;
        pointsAttaque = 45;
        pointsDefense = 40;
        pointsAttaqueSpe = 35;
        pointsDefenseSpe = 35;
        pointsVitesse = 56;
        type.add("normal");
        type.add("vol");
        evolution = 18;
        suite = new Roucoups();
    }
}
