package tp4ex1designpattern;

public class MachineVide extends Etat{

    public MachineVide(Destributeur destributeur) {
        super(destributeur);
    }
    
@Override
public void InsérerCarte (Carte carte ){    
  System.out.println("carte insérée déjà");    
}
@Override
public void EntrerCode (String code){
   
 System.out.println("code inséré déjà");      
}
@Override
public void RetirerEspèces (int somme){
System.out.println("pas de stock en argent");  
}
@Override
public void RetirerCarte (){ 
 System.out.println("carte retirée!");
 destributeur.setEtat(destributeur.pci);  
}
@Override
public void  lire_solde_compte(){
    System.out.println("vous n etes pas entrain de retirer des espèces");
}
public String toString(){
    return "MachineVide";
} 
    
    
}
