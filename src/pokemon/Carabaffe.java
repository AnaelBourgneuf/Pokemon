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
public class Carabaffe extends Pokemon{
    public Carabaffe(){
        pointsVie = 59;
        pointsAttaque = 63;
        pointsDefense = 80;
        pointsAttaqueSpe = 65;
        pointsDefenseSpe = 80;
        pointsVitesse = 58;
        type.add("eau");
        evolution = 36;
        suite = new Tortank();
    }
}
