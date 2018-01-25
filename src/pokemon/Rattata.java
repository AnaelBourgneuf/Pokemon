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
public class Rattata extends Pokemon{
    public Rattata(){
        pointsVie = 30;
        pointsAttaque = 56;
        pointsDefense = 35;
        pointsAttaqueSpe = 25;
        pointsDefenseSpe = 35;
        pointsVitesse = 72;
        type.add("normal");
        evolution = 20;
        suite = new Rattatac();
    }
}
