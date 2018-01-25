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
public class Gravalanch extends Pokemon{
    public Gravalanch(){
        pointsVie = 55;
        pointsAttaque = 95;
        pointsDefense = 115;
        pointsAttaqueSpe = 45;
        pointsDefenseSpe = 45;
        pointsVitesse = 35;
        type.add("roche");
        type.add("sol");
        evolution = 60;
        suite = new Grolem();
    }
}
