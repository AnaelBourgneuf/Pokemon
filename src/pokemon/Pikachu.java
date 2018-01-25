/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author clement
 */
public class Pikachu extends Pokemon{
    public Pikachu(){
        pointsVie = 35;
        pointsAttaque = 55;
        pointsDefense = 40;
        pointsAttaqueSpe = 50;
        pointsDefenseSpe = 50;
        pointsVitesse = 90;
        type.add("electrik");
        evolution = 30;
        suite = new Raichu();
    }
}
