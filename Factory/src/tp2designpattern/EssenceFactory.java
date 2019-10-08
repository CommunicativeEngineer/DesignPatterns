/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2designpattern;

/**
 *
 * @author Jihen
 */
public class EssenceFactory implements AbstractFactory {
    
    @Override
     public  AbstractVoiture CreateVoiture(){
         System.out.println("Creation de la voiture dans la classe EssenceFactory");
         System.out.println("Appel du constructeur de la voitureEssence");
         return new VoitureEssence();
     }
      @Override
    public  void CreateScooter(){
    }  
}
