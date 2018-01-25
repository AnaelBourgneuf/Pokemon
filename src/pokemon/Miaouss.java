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
public class Miaouss extends Pokemon{
    public Miaouss(){
        pointsVie = 40;
        pointsAttaque = 45;
        pointsDefense = 35;
        pointsAttaqueSpe = 40;
        pointsDefenseSpe = 40;
        pointsVitesse = 90;
        type.add("normal");
        evolution = 28;
        suite = new Persian();
    }
}
