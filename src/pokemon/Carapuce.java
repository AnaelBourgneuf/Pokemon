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
public class Carapuce extends Pokemon{
    public Carapuce(){
        pointsVie = 44;
        pointsAttaque = 48;
        pointsDefense = 65;
        pointsAttaqueSpe = 50;
        pointsDefenseSpe = 64;
        pointsVitesse = 43;
        type.add("eau");
        evolution = 16;
        suite = new Carabaffe();
    }
}
