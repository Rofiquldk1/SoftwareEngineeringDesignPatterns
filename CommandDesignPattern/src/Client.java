
public class Client {

	public static void main(String[] args) {

		onCommand c = new onCommand(new EnergyLight());
		offCommand c1 = new offCommand(new TubeLight());
		onCommand c2 = new onCommand(new EnergyLight());
		offCommand c3 = new offCommand(new TubeLight());
		
		Invoker i = new Invoker();
		i.setCommand(c3);
        i.pressButton();
		


	}

}
