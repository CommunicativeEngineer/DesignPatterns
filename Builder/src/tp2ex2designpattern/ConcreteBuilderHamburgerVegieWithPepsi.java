package tp2ex2designpattern;

public class ConcreteBuilderHamburgerVegieWithPepsi extends IBuilder {
     
    
    @Override
    public Meal getMeal(){ 
      System.out.println(" get Meal __ Concrete builder ");   
      return meal ; 
    }
    @Override
    public void getHamburger(){
     System.out.println(" getHamburger __ Concrete builder "); 
     Hamburger hamburger = new Végie();
     meal.setH(hamburger);
      
    }
    
    @Override
    public void getBoisson( ){
      System.out.println("getBoisson Pepsi __ concrete builder "); 
      Boisson b = new Pepsi();
      meal.setB(b);
        
    }  
}
