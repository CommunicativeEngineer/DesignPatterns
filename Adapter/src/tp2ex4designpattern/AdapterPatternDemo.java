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
public class AdapterPatternDemo {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
      AudioPlayer audioPlayer = new AudioPlayer();

      System.out.println("Début main");
      audioPlayer.play("mp3");
      audioPlayer.play("mp4");
      audioPlayer.play("v1");
      audioPlayer.play("avi");
      System.out.println("Fin main");
   }  
}
