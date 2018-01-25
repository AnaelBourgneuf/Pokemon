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
public class Otaria extends Pokemon{
    public Otaria(){
        pointsVie = 65;
        pointsAttaque = 45;
        pointsDefense = 55;
        pointsAttaqueSpe = 45;
        pointsDefenseSpe = 70;
        pointsVitesse = 45;
        type.add("eau");
        evolution = 34;
        suite = new Lamantine();
    }
}
