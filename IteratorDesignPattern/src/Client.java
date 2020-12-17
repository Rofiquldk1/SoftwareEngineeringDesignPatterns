import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Rofiqul","01",50000);
		Employee e2 = new Employee("Rofiqul2","02",55000);
		Employee e3 = new Employee("Rofiqul3","03",60000);
		Employee e4 = new Employee("Rofiqul4","04",40000);
		
		Employees emps = new Employees();
		emps.addEmp(e1);
		emps.addEmp(e2);
		emps.addEmp(e3);
		emps.addEmp(e4);
		
		//ArrayList<Employee> emp = (ArrayList<Employee>) emps.getEmps();
		
		//for(Employee i : emp) {
		//	System.out.println("Employee "+i);		
					
		//}
		
		
		Iterator itr = emps.getIterator();
		
		while(itr.hasNext()) {
			System.out.println("Employee "+itr.current());	
		}
		
		

	}

}
