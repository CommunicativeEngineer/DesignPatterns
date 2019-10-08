package tp4ex2designpattern;

public interface Tache {
 
/** Obtenir le nom de la tâche. */
public String getNom();

 /** Obtenir le coût de la tâche. */
public int getCout();

public void acceptVisit(IVisitor ivisitor);
     
}
