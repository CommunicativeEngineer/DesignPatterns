package tp4ex1designpattern;

public class Carte {

    private String code;
    private int compteur;
    private int solde;
    
    public Carte(String code) {
        this.code = code;
        this.compteur= 0;
    }
    public int getSolde() {
        return solde;
    }
    public void setSolde(int solde) {
        this.solde = solde;
    } 
    public boolean testerCode(String codeEntree){    
        return (code.equals(codeEntree));           
    }
   public int incrementerCompteur(){
       return compteur ++;
   } 
    public int getCompteur() {
        return compteur;
    }  
}
