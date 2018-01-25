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
public class Bulbizarre extends Pokemon{
    public Bulbizarre(){
        pointsVie = 45;
        pointsAttaque = 49;
        pointsDefense = 49;
        pointsAttaqueSpe = 65;
        pointsDefenseSpe = 65;
        pointsVitesse = 45;
        type.add("plante");
        type.add("poison");
        evolution = 16;
        suite = new Herbizarre();
    }
}
