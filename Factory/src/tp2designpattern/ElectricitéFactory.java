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
public class ElectricitéFactory implements AbstractFactory {
    
    @Override
     public  AbstractVoiture CreateVoiture(){
         return new VoitureElectricité();
     }
      @Override
    public  void CreateScooter(){
    }
    
}
