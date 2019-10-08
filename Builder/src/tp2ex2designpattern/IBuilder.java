package tp2ex2designpattern;


import tp2ex2designpattern.Boisson;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jihen
 */
public abstract class IBuilder {
    
    protected Meal meal ;
    
    // instanciation
    public void getNewMeal(){
        System.out.println("getNewMeal __ IBuilder "); 
        meal = new Meal();
        
    }
    //retouner le meal
    public Meal getMeal(){
     System.out.println("getMeal __ IBuilder "); 
      return meal; 
    }
    public void getHamburger(){
    System.out.println("getHamburger __ IBuilder ");  
     
    }
    public void getBoisson(){
       System.out.println("getBoisson __ IBuilder "); 
    }
    
}
