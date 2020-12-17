
public class Phone {
	 private String os,battery,model,version;
	 private int camera;
	 private double screenSize;
	
	 public Phone(String os, String battery, String model, String version, int camera, double screenSize) {
		super();
		this.os = os;
		this.battery = battery;
		this.model = model;
		this.version = version;
		this.camera = camera;
		this.screenSize = screenSize;
	}
	 
	
	public void view() {
 	   System.out.println("OS "+os);
 	   System.out.println("Battery "+battery);
 	   System.out.println("Model "+model);
 	   System.out.println("Version "+version);
 	   System.out.println("Camera "+camera);
 	   System.out.println("Screensize "+screenSize);

	}
	 
	 
}
