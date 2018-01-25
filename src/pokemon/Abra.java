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
public class Abra extends Pokemon{
    public Abra(){
        pointsVie = 25;
        pointsAttaque = 20;
        pointsDefense = 15;
        pointsAttaqueSpe = 105;
        pointsDefenseSpe = 55;
        pointsVitesse = 90;
        type.add("psy");
        evolution = 16;
        suite = new Kadabra();
    }
}
