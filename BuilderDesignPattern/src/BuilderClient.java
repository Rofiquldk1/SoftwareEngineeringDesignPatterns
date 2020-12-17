
public class BuilderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new PhoneBuilder("Intel","100").setBattery("ss").setCamera(2).Build();
		p.view();

	}

}
