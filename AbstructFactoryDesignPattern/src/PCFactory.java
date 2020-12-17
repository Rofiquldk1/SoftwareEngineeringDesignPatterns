
public class PCFactory implements ComputerAbstructFactory {

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC("Toshiba","4Gb","intel");
	}

	

}
