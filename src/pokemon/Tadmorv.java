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
public class Tadmorv extends Pokemon{
    public Tadmorv(){
        pointsVie = 80;
        pointsAttaque = 80;
        pointsDefense = 50;
        pointsAttaqueSpe = 40;
        pointsDefenseSpe = 50;
        pointsVitesse = 25;
        type.add("poison");
        evolution = 38;
        suite = new Grotadmorv();
    }
}
