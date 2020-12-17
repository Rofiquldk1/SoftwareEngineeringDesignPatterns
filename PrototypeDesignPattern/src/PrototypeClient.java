
public class PrototypeClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employees emps = new Employees();
		emps.loadData();
		
		Employees empsNew =  emps.clone();
		Employees empsNew1 = emps.clone();
		
		empsNew.addEmp("John");
		empsNew1.deleteEmp("Pankaj");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+empsNew.getEmpList());
		System.out.println("empsNew1 List: "+empsNew1.getEmpList());

	}

}
