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
public class Kokiyas extends Pokemon{
    public Kokiyas(){
        pointsVie = 30;
        pointsAttaque = 65;
        pointsDefense = 100;
        pointsAttaqueSpe = 45;
        pointsDefenseSpe = 25;
        pointsVitesse = 40;
        type.add("eau");
        evolution = 40;
        suite = new Crustabri();
    }
}
