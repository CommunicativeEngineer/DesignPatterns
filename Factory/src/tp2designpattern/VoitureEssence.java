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
public class VoitureEssence extends AbstractVoiture {
  
    private String type;
    
    
    public VoitureEssence (){
       
       System.out.println("Dans le  constructeur de la voitureEssence");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
        
}
