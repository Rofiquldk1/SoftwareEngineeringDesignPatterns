
public class PC implements Computer {
    private String hdd;
    private String ram;
    private String cpu;
        
	public PC(String hdd, String ram, String cpu) {
		super();
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("Call from PC");
		System.out.println("HDD "+hdd);
		System.out.println("RAM "+ram);
		System.out.println("CPU "+cpu);
	}

}
