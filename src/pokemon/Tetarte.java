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
public class Tetarte extends Pokemon{
    public Tetarte(){
        pointsVie = 65;
        pointsAttaque = 65;
        pointsDefense = 50;
        pointsAttaqueSpe = 50;
        pointsDefenseSpe = 50;
        pointsVitesse = 90;
        type.add("eau");
        evolution = 55;
        suite = new Tartard();
    }
}
