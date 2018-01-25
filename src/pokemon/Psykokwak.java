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
public class Psykokwak extends Pokemon{
    public Psykokwak(){
        pointsVie = 50;
        pointsAttaque = 52;
        pointsDefense = 48;
        pointsAttaqueSpe = 65;
        pointsDefenseSpe = 50;
        pointsVitesse = 55;
        type.add("eau");
        evolution = 33;
        suite = new Akwakwak();
    }
}
