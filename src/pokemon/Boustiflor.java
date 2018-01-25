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
public class Boustiflor extends Pokemon{
    public Boustiflor(){
        pointsVie = 65;
        pointsAttaque = 90;
        pointsDefense = 50;
        pointsAttaqueSpe = 85;
        pointsDefenseSpe = 45;
        pointsVitesse = 55;
        type.add("plante");
        type.add("poison");
        evolution = 45;
        suite = new Empliflor();
    }
}
