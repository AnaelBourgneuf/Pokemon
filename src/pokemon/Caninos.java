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
public class Caninos extends Pokemon{
    public Caninos(){
        pointsVie = 55;
        pointsAttaque = 70;
        pointsDefense = 45;
        pointsAttaqueSpe = 70;
        pointsDefenseSpe = 50;
        pointsVitesse = 60;
        type.add("feu");
        evolution = 30;
        suite = new Arcanin();
    }
}
