package tp4ex2designpattern;

public class TP4EX2DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         IVisitor iVisitor = new ConcreteVisitor();
         
         TacheElementaire te1 = new TacheElementaire("tache elementaire1", 1);
         TacheElementaire te2 = new TacheElementaire("tache elementaire2", 2);
         TacheElementaire te3 = new TacheElementaire("tache elementaire3", 3);
         TacheElementaire te4 = new TacheElementaire("tache elementaire1", 4);
        
         TacheComplexe tc1 = new TacheComplexe( "tache complexe 1");
         tc1.ajouterSousTache(te1);
     
         tc1.ajouterSousTache(te2);
         TacheComplexe tc2 = new TacheComplexe( "tache complexe 2");
         tc2.ajouterSousTache(tc1);
         tc2.ajouterSousTache(te3);
         tc2.ajouterSousTache(te4);
         
         tc2.acceptVisit(iVisitor);
    }
    
}
