
public class LaptopFactory implements ComputerAbstructFactory {

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Laptop("Toshiba","4Gb","intel");
	}

}
