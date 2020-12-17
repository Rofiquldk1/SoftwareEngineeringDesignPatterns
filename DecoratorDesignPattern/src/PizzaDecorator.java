
abstract class PizzaDecorator implements Pizza {

	protected Pizza tempPizza;
	
	public PizzaDecorator(Pizza tempPizza) {
		super();
		this.tempPizza = tempPizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost();
	}

}
