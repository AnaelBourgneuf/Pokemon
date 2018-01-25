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
public class Chenipan extends Pokemon{
    public Chenipan(){
        pointsVie = 45;
        pointsAttaque = 30;
        pointsDefense = 35;
        pointsAttaqueSpe = 20;
        pointsDefenseSpe = 20;
        pointsVitesse = 45;
        type.add("insecte");
        evolution = 7;
        suite = new Chrysacier();
    }
}
