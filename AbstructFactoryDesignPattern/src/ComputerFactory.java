
public class ComputerFactory {
	
	public Computer getComputer(ComputerAbstructFactory caf) {
		return caf.createComputer();
	}
	
}
