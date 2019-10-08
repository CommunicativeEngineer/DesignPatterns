
package tp2ex2designpattern;

public class TP2EX2DesignPattern {
 
    public static void main(String[] args) {
 
     System.out.println("Debut main");
     System.out.println("Instanciation du director __ main ");
     Preparation p  =  new  Preparation();
      
     System.out.println("Instanciation du IBuilder 1__ main ");
     IBuilder cb1;
     
     System.out.println("Concrete builder  1est Meal Hamburger + Pepsi __ main "); 
     cb1 = new ConcreteBuilderHamburgerVegieWithPepsi();
     
     System.out.println("préparation du meal 1 __ main "); 
     Meal m1 = p.preparerMeal(cb1);
    
    
     System.out.println("Fin main");
    }
    
}
