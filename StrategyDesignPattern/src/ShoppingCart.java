import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> item;
	private PaymentCard pc;
	private PaymentMobileBanking pb;
	
	
	public ShoppingCart() {
		item = new ArrayList<Item>();
	}

	public void addItem(Item i) {
		item.add(i);
	}
	
	public void deleteItem(Item i) {
		item.remove(i);
	}
	
	public double calculate() {
		double sum=0;
		
		for(Item i : item) {
			sum+=i.getItemPrice();
		}
		
		return sum;
	}
	
	public void PaymentMobileBanking(PaymentMobileBanking pm) {
		pm.payment();
	}
	
	public void PaymentCard(PaymentCard cc) {
		cc.payment();
	}

}
