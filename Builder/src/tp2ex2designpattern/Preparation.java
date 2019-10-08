package tp2ex2designpattern;
 
public class Preparation {
    
    public Meal preparerMeal (IBuilder iBuilder){
     
        System.out.println("getNewMeal __ preparerMeal "); 
        iBuilder.getNewMeal();
        System.out.println("getBoisson __ preparerMeal "); 
        iBuilder.getBoisson();
        System.out.println("getHamburger __ preparerMeal "); 
        iBuilder.getHamburger();
        System.out.println("getMeal __ preparerMeal "); 
        Meal meal = iBuilder.getMeal();
        System.out.println("return Meal __ preparerMeal "); 
        return meal;
        
    }    
}
