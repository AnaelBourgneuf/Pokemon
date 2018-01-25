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
public class NidoranF extends Pokemon{
    public NidoranF(){
        pointsVie = 55;
        pointsAttaque = 47;
        pointsDefense = 52;
        pointsAttaqueSpe = 40;
        pointsDefenseSpe = 40;
        pointsVitesse = 41;
        type.add("poison");
        evolution = 16;
        suite = new Nidorina();
    }
}
