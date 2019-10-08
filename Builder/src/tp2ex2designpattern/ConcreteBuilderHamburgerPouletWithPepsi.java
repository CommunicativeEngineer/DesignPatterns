package tp2ex2designpattern;

/**
 *
 * @author Jihen
 */
public class ConcreteBuilderHamburgerPouletWithPepsi extends IBuilder{
   
    
    @Override
    public Meal getMeal(){   
      return meal ; 
    }
    @Override
    public void getHamburger(){
     Hamburger hamburger = new Poulet();
     meal.setH(hamburger);
      
    }
    
    @Override
    public void getBoisson( ){
      Boisson b = new Pepsi();
      meal.setB(b);
        
    }   
}
