package tp4ex1designpattern;

public class EnAttenteDeRetirerDesEspèces extends Etat{

    public EnAttenteDeRetirerDesEspèces(Destributeur destributeur) {
        super(destributeur);
    }
    
@Override
public void InsérerCarte (Carte carte ){
   //si on essai d'entrer une carte, elle sera refusée dans cet état
  System.out.println("Une carte existe deja");    
}
@Override
public void EntrerCode (String code){
   //si on essai d'entrer un code, il sera refusé dans cet état
 System.out.println("Vous avez déjà entrer votre code");      
}
@Override
public void RetirerEspèces (int somme){
System.out.println("Merci de prendre votre argent");
//remettre l'état à pas de carte insérée
destributeur.setEtat(destributeur.pci);
}
@Override
public void RetirerCarte (){ 
 System.out.println("Pas de carte");
}
@Override
public void  lire_solde_compte(){
    System.out.println("votre solde est"+destributeur.getCarte().getSolde());
}
public String toString(){
    return "EnAttenteDeRetirerDesEspeces";
}    
}
