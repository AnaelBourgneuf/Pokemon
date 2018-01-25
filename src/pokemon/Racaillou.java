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
public class Racaillou extends Pokemon{
    public Racaillou(){
        pointsVie = 40;
        pointsAttaque = 80;
        pointsDefense = 100;
        pointsAttaqueSpe = 30;
        pointsDefenseSpe = 30;
        pointsVitesse = 20;
        type.add("roche");
        type.add("sol");
        evolution = 25;
        suite = new Gravalanch();
    }
}
