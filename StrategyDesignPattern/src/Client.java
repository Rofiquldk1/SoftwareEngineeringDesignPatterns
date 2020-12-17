import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Item it = new Item("Product1","01",100);
		Item it2 = new Item("Product2","02",200);
		Item it3 = new Item("Product3","03",400);
		Item it4 = new Item("Product4","04",600);
		
		ShoppingCart sc = new ShoppingCart();
		sc.addItem(it);
		sc.addItem(it2);
		sc.addItem(it3);
		sc.addItem(it4);
		
		double totalPrice = sc.calculate();
		
		//System.out.println("Payment price "+totalPrice);
		
		//If i want,i can access reference using ShoppingCart 
		ShoppingCart scd = new ShoppingCart();
		scd.PaymentMobileBanking(new Bkash());
		
		System.out.println("Enter your Payment option");
		System.out.println("1. Credit Card");
		System.out.println("2. Debit Card");
				
		Scanner sn = new Scanner(System.in);
		int input = sn.nextInt();
		PaymentCard cc = null;
		
		System.out.println("Enter your Payment option");
		System.out.println("1. Bkash");
		System.out.println("2. Rocket");		
		int input2 = sn.nextInt();

		if(input == 1) {
			cc = new CreditCard();
			cc.payment();
		}
		else if(input == 2) {
			cc = new DebitCard();
			cc.payment();
		}
		else {
			System.out.println("Invalid Option");
		}

		PaymentMobileBanking cc2;
		if(input2 == 1) {
			cc2 = new Bkash();
			cc2.payment();
		}
		else if(input2 == 2) {
			cc2 = new Rocket();
			cc2.payment();
		}
		else {
			System.out.println("Invalid Option");
		}

	}

}
