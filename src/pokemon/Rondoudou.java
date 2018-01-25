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
public class Rondoudou extends Pokemon{
    public Rondoudou(){
        pointsVie = 115;
        pointsAttaque = 45;
        pointsDefense = 20;
        pointsAttaqueSpe = 45;
        pointsDefenseSpe = 25;
        pointsVitesse = 20;
        type.add("normal");
        type.add("fee");
        evolution = 30;
        suite = new Grodoudou();
    }
}
