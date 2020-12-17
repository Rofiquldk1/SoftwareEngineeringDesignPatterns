
public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c1=Company.getCompanyInstance();
		c1.getCompanyInformation();
		Company c2=Company.getCompanyInstance();
		c2.getCompanyInformation();

		if(c1==c2)
		System.out.println("Both identifiers refer to the same object");
		else 
		System.out.println("Both identifiers refer to the different object");

  }

}
