/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;

/**
 *
 * @author Dragonlord
 */
public class Insecateur extends Pokemon{
    public Insecateur(){
        pointsVie = 70;
        pointsAttaque = 110;
        pointsDefense = 80;
        pointsAttaqueSpe = 55;
        pointsDefenseSpe = 80;
        pointsVitesse = 105;
        type.add("insecte");
        type.add("vol");
    }
}
