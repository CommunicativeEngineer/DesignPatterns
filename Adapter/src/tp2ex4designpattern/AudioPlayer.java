package tp2ex4designpattern;
/**
 * @author Jihen
 */
public class AudioPlayer implements MediaPlayer{
    
    MediaAdapter mediaAdapter; 

   @Override
   public void play(String audioType) {		

      //inbuilt support to play mp3 music files
      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("play mp3 file __ AudioPlayer " );			
      } 
      
      //mediaAdapter is providing support to play other file formats
      else if(audioType.equalsIgnoreCase("v1") || audioType.equalsIgnoreCase("mp4")){
         System.out.println(" mp4 ou v1 file __ AudioPlayer " );
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType);
      }
      
      else{
         System.out.println(audioType + " format not supported");
      }
   }   
}
