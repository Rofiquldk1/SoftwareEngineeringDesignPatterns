
public class PhoneBuilder {
    private String os,battery,model,version;
    private int camera;
    private double screenSize;
    
    //if i want,client must  assign some field.then create a constructor
    // using those field
    
	public PhoneBuilder(String model, String version) {
		super();
		this.model = model;
		this.version = version;
	}

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	
	public PhoneBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	
	
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	public Phone Build() {
		Phone p = new Phone(os,battery,model,version, camera,screenSize);
		return p;
	}
    
    
}
