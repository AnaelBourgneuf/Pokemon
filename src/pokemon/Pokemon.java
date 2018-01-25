/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;

public abstract class Pokemon {
    protected int pointsVie = 10 ;
    protected int pointsAttaque = 1;
    protected int pointsDefense = 1;
    protected int pointsAttaqueSpe = 1;
    protected int pointsDefenseSpe = 1;
    protected int pointsVitesse = 1;
    protected int experience = 1;
    protected ArrayList<String> type = new ArrayList();
    protected int niveau = 1;
    protected int evolution = 1000;
    protected Pokemon suite ;
    
    public static Pokemon instancieAuHasard() throws Exception{
        ArrayList pokemons = new ArrayList();
        pokemons.add("Abo"); pokemons.add("Abra"); pokemons.add("Amonita"); pokemons.add("Artikodin"); pokemons.add("Aspicot"); pokemons.add("Bulbizarre"); pokemons.add("Canarticho"); pokemons.add("Caninos"); pokemons.add("Carapuce"); pokemons.add("Chenipan"); pokemons.add("Chetiflor"); pokemons.add("Doduo"); pokemons.add("Electhor"); pokemons.add("Elektek"); pokemons.add("Evoli"); pokemons.add("Excelangue"); pokemons.add("Fantominus"); pokemons.add("Ferosinge"); pokemons.add("Goupix"); pokemons.add("Hypotrempe"); pokemons.add("Insecateur"); pokemons.add("Kabuto"); pokemons.add("Kangourex"); pokemons.add("Kicklee"); pokemons.add("Kokiyas"); pokemons.add("Krabby"); pokemons.add("Leveinard"); pokemons.add("Lippoutou"); pokemons.add("Lokhlass"); pokemons.add("Machoc"); pokemons.add("Magicarpe"); pokemons.add("Magmar"); pokemons.add("Magneti"); pokemons.add("Melofee"); pokemons.add("Mew"); pokemons.add("Mewtwo"); pokemons.add("Miaouss"); pokemons.add("Mimitoss"); pokemons.add("Minidraco"); pokemons.add("MrMime"); pokemons.add("Mystherbe"); pokemons.add("Metamorphe"); pokemons.add("NidoranF"); pokemons.add("NidoranM"); pokemons.add("Noeunoeuf"); pokemons.add("Nosferapti"); pokemons.add("Onix"); pokemons.add("Osselait"); pokemons.add("Otaria"); pokemons.add("Papilusion"); pokemons.add("Paras"); pokemons.add("Piafabec"); pokemons.add("Pikachu"); pokemons.add("Poissirene"); pokemons.add("Ponyta"); pokemons.add("Porygon"); pokemons.add("Psykokwak"); pokemons.add("Ptera"); pokemons.add("Ptitard"); pokemons.add("Racaillou"); pokemons.add("Ramoloss"); pokemons.add("Rattata"); pokemons.add("Rhinocorne"); pokemons.add("Rondoudou"); pokemons.add("Ronflex"); pokemons.add("Roucool"); pokemons.add("Sablette"); pokemons.add("Saquedeneu"); pokemons.add("Scarabrute"); pokemons.add("Smogo"); pokemons.add("Soporifik"); pokemons.add("Stari"); pokemons.add("Sulfura"); pokemons.add("Tadmorv"); pokemons.add("Taupiqueur"); pokemons.add("Tauros"); pokemons.add("Tentacool"); pokemons.add("Tygnon"); pokemons.add("Voltorbe");
        
        int indexAleatoire = 0 + (int)(Math.random() * ((pokemons.size() - 1) + 1));
        Pokemon pok = (Pokemon) Class.forName("pokemon."+pokemons.get(indexAleatoire)).getConstructor().newInstance();
        return pok;
    }
    
    public Pokemon evolve(){
        Pokemon nPKM = this.suite;
        nPKM.pointsAttaque += this.pointsAttaque;
        nPKM.pointsDefense += this.pointsDefense;
        nPKM.pointsAttaqueSpe += this.pointsAttaqueSpe;
        nPKM.pointsDefenseSpe += this.pointsDefenseSpe;
        nPKM.pointsVitesse += this.pointsVitesse;
        nPKM.experience = this.experience;
        nPKM.niveau = this.niveau;
        return nPKM;
    }
    
    public boolean checkEvolve(){
        if (this.niveau >= evolution){
            int nbA = 0 + (int)(Math.random() * ((10 - 0) + 1));
            if (nbA != 0){
                return true;
            }
        }
        return false;
    }
    
    public void LevelUp(){
        pointsAttaque += this.pointsAttaque/10;
        pointsDefense += this.pointsDefense/10;
        pointsAttaqueSpe += this.pointsAttaqueSpe/10;
        pointsDefenseSpe += this.pointsDefenseSpe/10;
        pointsVitesse += this.pointsVitesse/10;
        this.niveau += 1;
    }
    
    public boolean checkLevelUp(){
        ArrayList li = new ArrayList();
        li.add(10);
        
        for(int i = 0; i < li.size(); i++) {
            if (this.experience >=(int) li.get(i)){
                this.LevelUp();
                return true;
            }
        }
        return false;
    }

    public void attaque(Pokemon cible){
        int pointsEnMoins = (int) (this.pointsAttaque * ratioType(cible) - cible.pointsDefense / 2) ;
        if (pointsEnMoins < 1){
            pointsEnMoins = 1;
        }
        System.out.println("dégats donnés = " + pointsEnMoins);
        cible.pointsVie -= pointsEnMoins ;
        if(cible.pointsVie <= 0){
            cible.pointsVie = 0;
            this.experience += cible.experience;
            boolean up = this.checkLevelUp();
            if (up){
                System.out.println(getClass().getSimpleName() +" evolue");
            }
        }
    }
    
    public boolean estMort(){
        return pointsVie <= 0;
    }
    
    
    public String getType(int n){
        String str = new String(type.get(n));
        return str;
    }
    
    public float ratioType(Pokemon defenseur){
        for (int i = 0; i < type.size(); i++){
            String typeattaquant = getType(i);
            String typedefenseur = defenseur.getType(i);

            if(typeattaquant.equals("normal")){
                if (typedefenseur.equals("roche") || typedefenseur.equals("acier")){
                    return 1/2;
                }
                else if (typedefenseur.equals("spectre")){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("feu")){
                if (typedefenseur.equals("feu") || typedefenseur.equals("eau") || typedefenseur.equals("roche") || typedefenseur.equals("dragon")){
                    return 1/2;
                }
                else if (typedefenseur.equals("plant") || typedefenseur.equals("glace") || typedefenseur.equals("insecte") || typedefenseur.equals("acier")){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("eau")){
                if (typedefenseur.equals("eau") || typedefenseur.equals("plante") || typedefenseur.equals("dragon")){
                    return 1/2;
                }
                else if (typedefenseur.equals("feu") || typedefenseur.equals("sol") || typedefenseur.equals("roche")){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("plante")){
                if (typedefenseur.equals("feu") || typedefenseur.equals("plante") || typedefenseur.equals("poison") || typedefenseur.equals("vol") || typedefenseur.equals("insecte") || typedefenseur.equals("dragon") || typedefenseur.equals("acier")){
                    return 1/2;
                }
                else if (typedefenseur.equals("eau") || typedefenseur.equals("sol") || typedefenseur.equals("roche")){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("electrik")){
                if (typedefenseur.equals("plante") || typedefenseur.equals("electrik") || typedefenseur.equals("dragon")){
                    return 1/2;
                }
                else if (typedefenseur.equals("eau") || typedefenseur.equals("vol")){
                    return 2;
                }
                else if (typedefenseur.equals("sol")){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("glace")){
                if (typedefenseur.equals("feu") || typedefenseur.equals("eau") || typedefenseur.equals("glace") || typedefenseur.equals("acier")){
                    return 1/2;
                }
                else if (typedefenseur.equals("plante") || typedefenseur.equals("sol") || typedefenseur.equals("vol") || typedefenseur.equals("dragon")){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("combat")){
                if (typedefenseur.equals("poison") || typedefenseur.equals("vol") || typedefenseur.equals("psy") || typedefenseur.equals("insecte")){
                    return 1/2;
                }
                else if (typedefenseur.equals("normal") || typedefenseur.equals("glace") || typedefenseur.equals("roche") || typedefenseur.equals("tenebres") || typedefenseur.equals("acier")){
                    return 2;
                }
                else if (typedefenseur.equals("spectre")){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("poison")){
                if (typedefenseur.equals("poison") || typedefenseur.equals("sol") || typedefenseur.equals("roche") || typedefenseur.equals("spectre")){
                    return 1/2;
                }
                else if (typedefenseur.equals("plante")){
                    return 2;
                }
                else if (typedefenseur.equals("acier")){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("sol")){
                if (typedefenseur.equals("plante") || typedefenseur.equals("insecte")){
                    return 1/2;
                }
                else if (typedefenseur.equals("feu") || typedefenseur.equals("electrik") || typedefenseur.equals("poison") || typedefenseur.equals("roche") || typedefenseur.equals("acier")){
                    return 2;
                }
                else if (typedefenseur.equals("vol")){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("vol")){
                if (typedefenseur.equals("electrik") || typedefenseur.equals("roche") || typedefenseur.equals("acier")){
                    return 1/2;
                }
                else if (typedefenseur.equals("plante") || typedefenseur.equals("combat") || typedefenseur.equals("insecte")){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("psy")){
                if (typedefenseur.equals("psy") || typedefenseur.equals("acier")){
                    return 1/2;
                }
                else if (typedefenseur.equals("tenebres")){
                    return 0;
                }
                else if (typedefenseur.equals("combat") || typedefenseur.equals("poison")){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            if (typeattaquant.equals("insecte")){
                if (typedefenseur.equals("feu") || typedefenseur.equals("combat") || typedefenseur.equals("poison") || typedefenseur.equals("vol") || typedefenseur.equals("spectre") || typedefenseur.equals("acier")){
                    return 1/2;
                }
                else if (typedefenseur.equals("plante") || typedefenseur.equals("psy") || typedefenseur.equals("tenebres")){
                    return 2;
                }
                else{
                    return 1;
                }

            }
            if(typeattaquant.equals("roche")){
                if (typedefenseur.equals("combat") || typedefenseur.equals("sol") || typedefenseur.equals("acier")){
                    return 1/2;
                }
                else if (typedefenseur.equals("feu") || typedefenseur.equals("glace") || typedefenseur.equals("vol") || typedefenseur.equals("insecte")){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("spectre")){
                if (typedefenseur.equals("tenebres") || typedefenseur.equals("acier")){
                    return 1/2;
                }
                else if (typedefenseur.equals("normal")){
                    return 0;
                }
                else if (typedefenseur.equals("psy") || typedefenseur.equals("spectre")){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("dragon")){
                if (typedefenseur.equals("acier")){
                    return 1/2;
                }
                else if (typedefenseur.equals("dragon")){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("tenebres")){
                if (typedefenseur.equals("combat") || typedefenseur.equals("tenebres") || typedefenseur.equals("acier")){
                    return 1/2;
                }
                else if (typedefenseur.equals("psy") || typedefenseur.equals("spectre")){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            if(typeattaquant.equals("acier")){
                if (typedefenseur.equals("feu") || typedefenseur.equals("eau") || typedefenseur.equals("acier")){
                    return 1/2;
                }
                else if (typedefenseur.equals("glace") || typedefenseur.equals("roche")){
                    return 2;
                }
                else{
                    return 1;
                }
            }
        }
        return 1;
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " {mort=" +
                estMort() + ", pointsVie=" + pointsVie +
                ", pointsDefense=" + pointsDefense +
                ", pointsAttaque=" + pointsAttaque + 
                ", experience=" + experience + '}';
    }
    
    
}
