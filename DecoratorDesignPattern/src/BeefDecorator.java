

public class BeefDecorator extends PizzaDecorator {

	public BeefDecorator(Pizza tempPizza) {
		super(tempPizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + " Beef";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + 100;
	}


}
