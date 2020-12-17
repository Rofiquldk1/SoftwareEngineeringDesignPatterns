
public class AdvancedMediaPlayerFactory {
   private static AdvanceMediaPlayer ampa;
   public static AdvanceMediaPlayer createdAdvancedPlayer(String type) {
	   if(type.equalsIgnoreCase("vlc")) {
		   ampa = new VLCPlayer();
	   }
	   else if(type.equalsIgnoreCase("mp4")) {
		   ampa = new MP4Player();		   
	   }
	   return ampa;
   }
}
