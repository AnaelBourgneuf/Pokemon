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
public class Aspicot extends Pokemon{
    public Aspicot(){
        pointsVie = 40;
        pointsAttaque = 35;
        pointsDefense = 30;
        pointsAttaqueSpe = 20;
        pointsDefenseSpe = 20;
        pointsVitesse = 50;
        type.add("insecte");
        type.add("poison");
        evolution = 7;
        suite = new Coconfort();
    }
}
