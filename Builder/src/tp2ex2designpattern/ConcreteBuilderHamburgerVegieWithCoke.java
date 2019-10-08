package tp2ex2designpattern;

public class ConcreteBuilderHamburgerVegieWithCoke extends IBuilder {
      
    
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
      Boisson b = new Coke();
      meal.setB(b);
        
    }
    
}
