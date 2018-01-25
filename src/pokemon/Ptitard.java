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
public class Ptitard extends Pokemon{
    public Ptitard(){
        pointsVie = 40;
        pointsAttaque = 50;
        pointsDefense = 40;
        pointsAttaqueSpe = 40;
        pointsDefenseSpe = 40;
        pointsVitesse = 90;
        type.add("eau");
        evolution = 25;
        suite = new Tetarte();
    }
}
