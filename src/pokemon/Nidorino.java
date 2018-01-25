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
public class Nidorino extends Pokemon{
    public Nidorino(){
        pointsVie = 61;
        pointsAttaque = 72;
        pointsDefense = 57;
        pointsAttaqueSpe = 55;
        pointsDefenseSpe = 55;
        pointsVitesse = 65;
        type.add("poison");
        evolution = 40;
        suite = new Nidoking();
    }
}
