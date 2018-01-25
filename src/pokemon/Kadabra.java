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
public class Kadabra extends Pokemon{
    public Kadabra(){
        pointsVie = 40;
        pointsAttaque = 35;
        pointsDefense = 30;
        pointsAttaqueSpe = 120;
        pointsDefenseSpe = 70;
        pointsVitesse = 105;
        type.add("psy");
        evolution = 40;
        suite = new Alakazam();
    }
}
