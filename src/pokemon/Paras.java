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
public class Paras extends Pokemon{
    public Paras(){
        pointsVie = 35;
        pointsAttaque = 70;
        pointsDefense = 55;
        pointsAttaqueSpe = 45;
        pointsDefenseSpe = 55;
        pointsVitesse = 25;
        type.add("insecte");
        type.add("plante");
        evolution= 24;
        suite = new Parasect();
    }
}
