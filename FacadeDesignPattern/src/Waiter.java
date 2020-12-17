
public class Waiter {
  public static String deliverFood(FoodType ft) {
	  Ingredients ing = new Ingredients();
	  Food food;
	  switch(ft) {
	   case PIZZA:
		   food = new Pizza();
		   String pizzaIng = ing.getPizzaItems();
		   food.preparedFood(pizzaIng);
		   return food.deliverFood();		  
	   case PASTA:
		   food = new Pasta();
		   String pastaIng = ing.getPastaItems();
		   food.preparedFood(pastaIng);
		   return food.deliverFood();
		default:
			return null;
	  }
  }
}
