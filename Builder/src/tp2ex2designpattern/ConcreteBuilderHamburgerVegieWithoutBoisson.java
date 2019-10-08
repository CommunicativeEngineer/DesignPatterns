
package tp2ex2designpattern;

/**
 *
 * @author Jihen
 */
public class ConcreteBuilderHamburgerVegieWithoutBoisson extends IBuilder{
   
    
    @Override
    public Meal getMeal(){   
      return meal ; 
    }
    @Override
    public void getHamburger(){
     Hamburger hamburger = new Végie();
     meal.setH(hamburger);
      
    }
    
    @Override
    public void getBoisson( ){
         
    }   
}
