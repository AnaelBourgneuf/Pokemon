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
public class Chetiflor extends Pokemon{
    public Chetiflor(){
        pointsVie = 50;
        pointsAttaque = 75;
        pointsDefense = 35;
        pointsAttaqueSpe = 70;
        pointsDefenseSpe = 30;
        pointsVitesse = 40;
        type.add("plante");
        type.add("poison");
        evolution = 21;
        suite = new Boustiflor();
    }
}
