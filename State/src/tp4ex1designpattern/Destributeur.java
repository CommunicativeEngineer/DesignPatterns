package tp4ex1designpattern;

public class Destributeur {

private Etat etat;
public final PasDeCarteInseree pci = new PasDeCarteInseree(this);
public final EnAttentedOpération eao = new EnAttentedOpération(this);
public final EnAttenteDeRetirerDesEspèces eare= new EnAttenteDeRetirerDesEspèces(this);
public final MachineVide mv = new MachineVide(this);
private Carte carte;
public static int stockArgent;


public Destributeur(int stockArgent) {
        //Au début le destributeur n'a pas de carte, état : pas de carte insérée
        this.etat = pci;  
        Destributeur.stockArgent= stockArgent;
}

public void setEtat(Etat etat) {
        this.etat = etat;
}

public Etat getEtat() {
        return etat;
}

public Carte getCarte() {
        return carte;
}

public void setCarte(Carte carte) {
        this.carte = carte;
}

public static int getStockArgent() {
        return stockArgent;
}

public static void setStockArgent(int stockArgent) {
        Destributeur.stockArgent = stockArgent;
}
    
public void avalerCarte(){
   System.out.println("carte avalée"); 
   this.etat = pci;   
}
    
public void InsérerCarte (Carte carte ){
    etat.InsérerCarte(carte);
}
public void EntrerCode (String code){  
    etat.EntrerCode(code);  
}
public void RetirerEspèces (int somme){   
  etat.RetirerEspèces(somme);
}
public void RetirerCarte ( ){ 
 etat.RetirerCarte(); 
}
public void  lire_solde_compte(){
    etat.lire_solde_compte();
}

}
