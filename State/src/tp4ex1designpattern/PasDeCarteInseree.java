 package tp4ex1designpattern;
 
public class PasDeCarteInseree extends Etat{
 
public PasDeCarteInseree(Destributeur destributeur) {
    super(destributeur);
    }
   
@Override
public void InsérerCarte (Carte carte ){
  //définir la carte avec la carte insérée
  destributeur.setCarte(carte);
  //changer l'état du destributeur à l'état en attente d'operation
  destributeur.setEtat(destributeur.eao);    
}
@Override
public void EntrerCode (String code){
     //si on essai d'entrer un code, il sera refusé dans cet état
    System.out.println("veuillez entrer votre carte SVP");   
}
@Override
public void RetirerEspèces (int somme){
 System.out.println("veuillez entrer votre carte SVP");    
}
@Override
public void RetirerCarte ( ){
 System.out.println("Pas de carte");   
}
 @Override
 public void  lire_solde_compte(){
  System.out.println("Pas de carte");    
 }
public String toString(){
    return "PasDeCarteInseree";
}
}
