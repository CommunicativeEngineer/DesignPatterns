/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2ex4designpattern;

/**
 *
 * @author Jihen
 */
public class V1Player implements AdvancedMediaPlayer {
     
    @Override
   public void playV1( ) {
      System.out.println("Playing v1 __class V1Player " );		
   }

   @Override
   public void playMp4() {
      //do nothing
   }
    
}
