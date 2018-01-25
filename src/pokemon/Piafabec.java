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
public class Piafabec extends Pokemon{
    public Piafabec(){
        pointsVie = 40;
        pointsAttaque = 60;
        pointsDefense = 30;
        pointsAttaqueSpe = 31;
        pointsDefenseSpe = 31;
        pointsVitesse = 70;
        type.add("normal");
        type.add("vol");
        evolution = 20;
        suite = new Rapasdepic();
    }
}
