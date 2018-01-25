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
public class Evoli extends Pokemon{
    public Evoli() throws Exception{
        pointsVie = 55;
        pointsAttaque = 55;
        pointsDefense = 50;
        pointsAttaqueSpe = 45;
        pointsDefenseSpe = 65;
        pointsVitesse = 55;
        type.add("normal");
        evolution = 20;
        suite = randomEvol();
    }
    
    public static Pokemon randomEvol() throws Exception{
        ArrayList pokemons = new ArrayList();
        pokemons.add("Aquali"); pokemons.add("Voltali"); pokemons.add("Pyroli");
        
        int indexAleatoire = 0 + (int)(Math.random() * ((pokemons.size() - 1) + 1));
        Pokemon pok = (Pokemon) Class.forName("pokemon."+pokemons.get(indexAleatoire)).getConstructor().newInstance();
        return pok;
    }
}
