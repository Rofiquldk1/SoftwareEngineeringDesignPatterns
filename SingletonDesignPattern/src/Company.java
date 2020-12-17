
public class Company {
	private static Company CompanyInstance=null;
	private String name= "CSE";
	private String address="Margao";
	private String regnumber="AI";

	private Company() {
		
	}
	
	public static Company getCompanyInstance() {
	if(CompanyInstance==null) {
	   Company c1=new Company();
	   CompanyInstance=c1;
	  }
	  return CompanyInstance; 
	}
	
	public void getCompanyInformation() {
	   System.out.println("Name of Company"+name);
	   System.out.println("Address of Company " + address);
	   System.out.println("Registration Number of Company" + regnumber);
	}

}
