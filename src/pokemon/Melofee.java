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
public class Melofee extends Pokemon{
    public Melofee(){
        pointsVie = 70;
        pointsAttaque = 45;
        pointsDefense = 48;
        pointsAttaqueSpe = 60;
        pointsDefenseSpe = 65;
        pointsVitesse = 35;
        type.add("fee");
        evolution = 30;
        suite = new Melodelfe();
    }
}
