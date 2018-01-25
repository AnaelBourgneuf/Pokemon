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
public class Nidorina extends Pokemon{
    public Nidorina(){
        pointsVie = 70;
        pointsAttaque = 62;
        pointsDefense = 67;
        pointsAttaqueSpe = 55;
        pointsDefenseSpe = 55;
        pointsVitesse = 56;
        type.add("poison");
        evolution = 40;
        suite = new Nidoqueen();
    }
}
