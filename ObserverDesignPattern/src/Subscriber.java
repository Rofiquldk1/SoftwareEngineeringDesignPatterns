
public class Subscriber implements Observer {
	private String name;
	Channel ch;
	
	@Override
	public void setCh(Channel ch) {
		this.ch = ch;
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println("Hi " + name +" "+ ch.title +", Uploaded");	
	}
	
	

}
