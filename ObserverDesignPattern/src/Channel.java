import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	List<Subscriber> sc = new ArrayList<Subscriber>();
	public String title;
	
	@Override
	public void subscribe(Subscriber s) {
		sc.add(s);
	}
	
	@Override
	public void unsubscribe(Observer s) {
		sc.remove(s);
	}
	
	@Override
	public void notifySubscriber() {
		for(Observer s : sc) {
			s.update();
		}
	}

	@Override
	public void upload(String title) {
		this.title=title;
		notifySubscriber();
	}

}
