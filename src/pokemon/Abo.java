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
public class Abo extends Pokemon{
    public Abo(){
        pointsVie = 35;
        pointsAttaque = 60;
        pointsDefense = 44;
        pointsAttaqueSpe = 40;
        pointsDefenseSpe = 54;
        pointsVitesse = 55;
        type.add("poison");
        evolution = 22;
        suite = new Arbok();
    }
}
