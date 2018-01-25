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
public class Ferosinge extends Pokemon{
    public Ferosinge(){
        pointsVie = 40;
        pointsAttaque = 80;
        pointsDefense = 35;
        pointsAttaqueSpe = 35;
        pointsDefenseSpe = 45;
        pointsVitesse = 70;
        type.add("combat");
        evolution = 28;
        suite = new Colossinge();
    }
}
