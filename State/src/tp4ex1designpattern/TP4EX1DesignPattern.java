package tp4ex1designpattern;
 
public class TP4EX1DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("main: instanciation de la cate 1");
        Carte carte1 = new Carte ("123");
         System.out.println("main: instanciation du destributeur");
        Destributeur destributeur = new Destributeur(400000);
         System.out.println("main: état du destributeur est:");
        System.out.println(destributeur.getEtat().toString());
         System.out.println("main: insertion de la carte 1");
        destributeur.InsérerCarte(carte1);
         System.out.println("main: état du destributeur est:");
        System.out.println(destributeur.getEtat().toString());
         System.out.println("main: test sur le nombre de tentative et l'aval de la carte, carte 1"); 
        destributeur.EntrerCode("243");
        destributeur.EntrerCode("253");
        destributeur.EntrerCode("241");
        destributeur.EntrerCode("248"); 
         System.out.println("main: état du destributeur est:");
        System.out.println(destributeur.getEtat().toString());
         System.out.println("main: instanciation de la cate 2");
        Carte carte2 = new Carte ("1234");
         System.out.println("main: essai d'insertion de code , destributeur sans carte");
        destributeur.EntrerCode("123");
         System.out.println("main: état du destributeur est:");
        System.out.println(destributeur.getEtat().toString());
         System.out.println("main: essai de retrait d argent , destributeur sans carte");
        destributeur.RetirerEspèces(200000);
         System.out.println("main: état du destributeur est:");
        System.out.println(destributeur.getEtat().toString()); 
        System.out.println("main: insertion de la carte 2");
        destributeur.InsérerCarte(carte2);
         System.out.println("main: état du destributeur est:");
        System.out.println(destributeur.getEtat().toString());
        System.out.println("main: insertion du code de la carte 2");
        destributeur.EntrerCode("1234"); 
         System.out.println("main: état du destributeur est:");
        System.out.println(destributeur.getEtat().toString());
         System.out.println("main: retrait de l argent de la carte 2");
        destributeur.RetirerEspèces(200000); 
         System.out.println("main: état du destributeur est:");
        System.out.println(destributeur.getEtat().toString());      
    }
    
}
