package tp4ex2designpattern;
 
public class TacheElementaire implements Tache{
 
    private String nom;
    private int cout;

    public TacheElementaire(String nom, int cout) {
        this.nom = nom;
        this.cout = cout;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getCout() {
        return cout;
    }
    
    @Override
    public void acceptVisit(IVisitor ivisitor){
        ivisitor.visit(this);
    }
    
}
