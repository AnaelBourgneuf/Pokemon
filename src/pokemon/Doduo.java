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
public class Doduo extends Pokemon{
    public Doduo(){
        pointsVie = 35;
        pointsAttaque = 85;
        pointsDefense = 45;
        pointsAttaqueSpe = 35;
        pointsDefenseSpe = 35;
        pointsVitesse = 75;
        type.add("normal");
        type.add("vol");
        evolution = 31;
        suite = new Dodrio();
    }
}
