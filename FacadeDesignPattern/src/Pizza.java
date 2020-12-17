
public class Pizza implements Food {
    private String preparedItem;
	public void preparedFood(String pizzaIng) {
		// TODO Auto-generated method stub
		preparedItem = "Thin crust pizza with ingredients "+pizzaIng;
		
	}

	public String deliverFood() {
		// TODO Auto-generated method stub
		return preparedItem;
	}

}
