package tp2designpattern;

 


/**
 *
 * @author Jihen
 */
public class TP2DesignPattern {
    
    public static void main(String[] args) {
     
       EssenceFactory essenceFactory  = new EssenceFactory ();
        System.out.println("Debut Catalogue");      
       essenceFactory.CreateVoiture();
       
       System.out.println("Fin Catalogue");
        
        
    }
    
}
