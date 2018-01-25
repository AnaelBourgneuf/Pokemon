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
public class Chrysacier extends Pokemon{
    public Chrysacier(){
        pointsVie = 50;
        pointsAttaque = 20;
        pointsDefense = 55;
        pointsAttaqueSpe = 25;
        pointsDefenseSpe = 25;
        pointsVitesse = 30;
        type.add("insecte");
        evolution = 10;
        suite = new Papilusion();
    }
}
