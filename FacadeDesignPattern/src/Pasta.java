
public class Pasta implements Food {

	private String preparedItem;
	
	public void preparedFood(String pastaIng) {
		// TODO Auto-generated method stub
		preparedItem = "Thin crust pasta with ingredients "+pastaIng;
		
	}

	public String deliverFood() {
		// TODO Auto-generated method stub
		return preparedItem;
	}


}
