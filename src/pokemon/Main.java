/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.Scanner;

/**
 *
 * @author clement
 */
public class Main {
    public static void main(String[] args) throws Exception {
        
        Arene kanto = new Arene();
        
        int nb = nbPKM();
        for (int i = 0; i < nb; i++){
            kanto.add(Pokemon.instancieAuHasard());
        }
        
        kanto.add(new Pikachu());
        //kanto.add(new Bulbizarre());
        kanto.add(new Carapuce());
        //kanto.add(new Salameche());
        //kanto.add(new Rondoudou());
        kanto.run();
        pln(kanto);

    }
    
    public static int nbPKM(){
        System.out.println("Entrez le nombre de pokemon à ajouter dans l'arène :");
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        int nb = Integer.valueOf(name);
        if (nb > 2 && nb < 1000){
            return nb;
        }
        return 0;
    }
    
    public static void pln(Object obj){
        System.out.println(obj);
    }
}
