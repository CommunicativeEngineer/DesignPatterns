 package tp4ex2designpattern;
 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TacheComplexe implements Tache, Iterable<Tache>{
   
    private Collection<Tache> sousTaches ;
    private String nom;
    

    public TacheComplexe( String nom) {
        this.sousTaches = new ArrayList<>();
        this.nom = nom;
    }
     
    @Override
   public String getNom() {
        return this.nom;
    }
   
    @Override
    public int getCout() {
        int resultat = 0;
        for (Tache t:sousTaches){
           resultat+= t.getCout();
        }
        return resultat;
    }  
    
    public void ajouterSousTache(Tache tache){
        sousTaches.add(tache);
    }
    
    public void supprimerSousTache(Tache tache){
        sousTaches.remove(tache);
    }

    @Override
    public Iterator<Tache> iterator() {
         return this.sousTaches.iterator(); 
    }
     @Override
    public void acceptVisit(IVisitor ivisitor){
        ivisitor.visit(this);
    }

    public Collection<Tache> getSousTaches() {
        return sousTaches;
    }
    
    
}
