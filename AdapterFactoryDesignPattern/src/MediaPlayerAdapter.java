
public class MediaPlayerAdapter implements MediaPlayer {
   private AdvanceMediaPlayer ampa;
   public void play(String type,String fn) {	   
	   ampa = AdvancedMediaPlayerFactory.createdAdvancedPlayer(type);
	   ampa.run(fn);
   }
}
