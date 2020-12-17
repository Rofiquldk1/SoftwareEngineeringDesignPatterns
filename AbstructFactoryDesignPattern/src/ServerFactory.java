
public class ServerFactory implements ComputerAbstructFactory  {

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Server("Toshiba","4Gb","intel");
	}

	
}
