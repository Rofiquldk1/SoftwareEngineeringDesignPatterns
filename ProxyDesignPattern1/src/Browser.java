
public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebProxy wp = new WebProxy(new WebPageImp());
		wp.render("www.facebook.com");

	}

}
