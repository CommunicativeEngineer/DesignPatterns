package tp2ex4designpattern;
public class MediaAdapter implements MediaPlayer {
  
AdvancedMediaPlayer advancedMusicPlayer;
   public  MediaAdapter(String audioType){
   
      if(audioType.equalsIgnoreCase("v1") ){
         System.out.println("transformation en  v1 file __ MediaAdapter " );
         advancedMusicPlayer = new V1Player();			
         
      }else if (audioType.equalsIgnoreCase("mp4")){
         System.out.println("transformation en  mp4 file __ MediaAdapter " );
         advancedMusicPlayer = new MP4Player();
      }	}

   @Override
   public void play(String audioType) {
   
      if(audioType.equalsIgnoreCase("v1")){
         System.out.println(" play v1 file __ MediaAdapter " );
         advancedMusicPlayer.playV1();
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         System.out.println(" play mp4 file __ MediaAdapter " );
         advancedMusicPlayer.playMp4();
      }
   }
}
