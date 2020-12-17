
public class DecoratorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pp = new TomatoSauceDecorator(new MozerallaDecorator(new BeefDecorator(new ItelianPizza())));
		
 	    System.out.println(pp.getDescription());
 	    System.out.println(pp.getCost());

		

	}

}
