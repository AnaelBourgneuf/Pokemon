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
public class Ectoplasma extends Pokemon{
    public Ectoplasma(){
        pointsVie = 60;
        pointsAttaque = 65;
        pointsDefense = 60;
        pointsAttaqueSpe = 130;
        pointsDefenseSpe = 75;
        pointsVitesse = 110;
        type.add("spectre");
        type.add("poison");
    }
}
