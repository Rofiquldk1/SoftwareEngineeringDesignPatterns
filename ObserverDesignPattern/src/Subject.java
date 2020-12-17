
public interface Subject {

	void subscribe(Subscriber s);

	void unsubscribe(Observer s);

	void notifySubscriber();

	void upload(String title);

}