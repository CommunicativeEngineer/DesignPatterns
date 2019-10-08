package tp4ex1designpattern;

public class EnAttentedOpération extends Etat {

    public EnAttentedOpération(Destributeur destributeur) {
    super(destributeur);
    }
    
    
 @Override
public void InsérerCarte (Carte carte){
    //si on essai d'entrer une carte, elle sera refusée dans cet état
  System.out.println("carte déjà insérée");    
}
@Override
public void EntrerCode (String code){
 // appel de test sur la carte et si besoin d avalerCarte  
 if (destributeur.getCarte().testerCode(code)){
     System.out.println("succès de la saisie du code!");
 }
 else{
    destributeur.getCarte().incrementerCompteur();
    if(destributeur.getCarte().getCompteur()>=3){
        destributeur.avalerCarte();
    }
 }
}
@Override
public void RetirerEspèces (int somme){ 
    if(Destributeur.stockArgent==0)
    {
        destributeur.setEtat(destributeur.mv);
    }
    else
    { 
       if(Destributeur.stockArgent>=somme)
       {   //retirer la carte avant de prendre l'argent
            this.RetirerCarte();  
            if(destributeur.getEtat()== destributeur.pci)
            {    
                destributeur.setEtat(destributeur.eare);
                destributeur.eare.RetirerEspèces(somme);
            }
       }
       else
       {
           System.out.println("stock en argent insuffisant");
       }
    } 
}
@Override
public void RetirerCarte ( ){
 //dans le cas ou l'utilisateur a retiré la carte sans retirer de l'argent
 //ou bien dans le cas ou l'utilisateur a retiré de l'argent
 System.out.println("carte retirée!");
 destributeur.setEtat(destributeur.pci);    
}
@Override
public void  lire_solde_compte(){
System.out.println("procédez au retrait d'argent");    
}
public String toString(){
    return "EnAttentedOperation";
}
}
