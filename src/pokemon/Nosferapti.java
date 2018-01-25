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
public class Nosferapti extends Pokemon{
    public Nosferapti(){
        pointsVie = 40;
        pointsAttaque = 45;
        pointsDefense = 35;
        pointsAttaqueSpe = 30;
        pointsDefenseSpe = 40;
        pointsVitesse = 55;
        type.add("poison");
        type.add("vol");
        evolution = 22;
        suite = new Nosferalto();
    }
}
