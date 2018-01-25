
package pokemon;

import java.util.ArrayList;


public class Arene extends ArrayList<Pokemon>{
    
    
    public int nombreDeSurvivants(){
        int nombreSurvivants = 0;
        for(int i = 0 ; i < size() ; i ++){
            if( ! get(i).estMort()){
                nombreSurvivants++;
            }
        }
        return nombreSurvivants;
    }
    
    
     public void tour(){
        for(int i = 0; i < size() ; i++  ){
            
            Pokemon attaquant = get(i);
            if (!attaquant.estMort()){
                Pokemon cible = get(0 + (int)(Math.random() * ((size() - 1) + 1)));
                while (cible.estMort() || cible == attaquant){
                    cible = get(0 + (int)(Math.random() * ((size() - 1) + 1)));
                }
                System.out.println(attaquant.getClass().getSimpleName() + " attaque " + cible.getClass().getSimpleName());

                attaquant.attaque(cible);
            }
        }
    }
     
     public void run(){
         while(nombreDeSurvivants() > 1){// plus de 1 survivant
            tour();// chaque pokemon attaque un de ses adversaires
            System.out.println("");
        }
     }

    @Override
    public String toString() {
        String str = "--- Arene ---\n";
        for(int i = 0 ; i < size() ; i ++){
            str += "" + get(i) + '\n';
        }
        return str;
    }
}
