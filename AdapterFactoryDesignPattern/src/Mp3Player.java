
public class Mp3Player implements MediaPlayer {
	private MediaPlayerAdapter mpa;
	public void play(String type,String fn) {
	   if(type.equalsIgnoreCase("MP3")) {		   
		 System.out.println("Playing MP3 "+fn);
	   }
	   else{		   
		 mpa = new MediaPlayerAdapter();
		 mpa.play(type,fn);
	   }
	}

}
