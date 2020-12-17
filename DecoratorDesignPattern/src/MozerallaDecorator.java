
public class MozerallaDecorator extends PizzaDecorator {

	public MozerallaDecorator(Pizza tempPizza) {
		super(tempPizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + " Mozeralla";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + 2;
	}


}
