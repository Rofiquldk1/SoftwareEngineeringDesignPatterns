
public class TomatoSauceDecorator extends PizzaDecorator {

	public TomatoSauceDecorator(Pizza tempPizza) {
		super(tempPizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + " Tomato Sauce";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + 3;
	}

}
