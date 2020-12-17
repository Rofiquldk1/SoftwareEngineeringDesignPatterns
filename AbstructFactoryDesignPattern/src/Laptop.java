
public class Laptop implements Computer {
	 private String hdd;
	 private String ram;
	 private String cpu;
	        
	 public Laptop(String hdd, String ram, String cpu) {
		super();
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	 }
	 @Override
	 public void view() {
			// TODO Auto-generated method stub
		System.out.println("Call from Laptop");
		System.out.println("HDD "+hdd);
		System.out.println("RAM "+ram);
		System.out.println("CPU "+cpu);
	}

		


}
