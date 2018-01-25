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
public class Herbizarre extends Pokemon{
    public Herbizarre(){
        pointsVie = 60;
        pointsAttaque = 62;
        pointsDefense = 63;
        pointsAttaqueSpe = 80;
        pointsDefenseSpe = 80;
        pointsVitesse = 60;
        type.add("plante");
        type.add("poison");
        evolution = 32;
        suite = new Florizarre();
    }
}
