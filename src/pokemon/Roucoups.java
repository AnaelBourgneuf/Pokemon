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
public class Roucoups extends Pokemon{
    public Roucoups(){
        pointsVie = 63;
        pointsAttaque = 60;
        pointsDefense = 55;
        pointsAttaqueSpe = 50;
        pointsDefenseSpe = 50;
        pointsVitesse = 71;
        type.add("normal");
        type.add("vol");
        evolution = 36;
        suite = new Roucarnage();
    }
}
