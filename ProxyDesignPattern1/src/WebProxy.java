
public class WebProxy implements WebInterface {
	WebPageImp wpi;
	
	public WebProxy(WebPageImp wpi) {
		super();
		this.wpi = wpi;
	}

	public void render(String url) {
		if(url.equalsIgnoreCase("www.youtube.com")) {
			System.out.println(url+" is blocked");	
		}
		else {
			wpi.render(url);
		}
	}
}
