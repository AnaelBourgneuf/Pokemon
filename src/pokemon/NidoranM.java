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
public class NidoranM extends Pokemon{
    public NidoranM(){
        pointsVie = 46;
        pointsAttaque = 57;
        pointsDefense = 40;
        pointsAttaqueSpe = 40;
        pointsDefenseSpe = 40;
        pointsVitesse = 50;
        type.add("poison");
        evolution = 16;
        suite = new Nidorino();
    }
}
