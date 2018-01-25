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
public class Krabby extends Pokemon{
    public Krabby(){
        pointsVie = 30;
        pointsAttaque = 105;
        pointsDefense = 90;
        pointsAttaqueSpe = 25;
        pointsDefenseSpe = 25;
        pointsVitesse = 50;
        type.add("eau");
        evolution = 28;
        suite = new Krabboss();
    }
}
