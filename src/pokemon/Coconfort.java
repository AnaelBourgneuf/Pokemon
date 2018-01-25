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
public class Coconfort extends Pokemon{
    public Coconfort(){
        pointsVie = 45;
        pointsAttaque = 25;
        pointsDefense = 50;
        pointsAttaqueSpe = 25;
        pointsDefenseSpe = 25;
        pointsVitesse = 35;
        type.add("insecte");
        type.add("poison");
        evolution = 10;
        suite = new Dardargnan();
    }
}
