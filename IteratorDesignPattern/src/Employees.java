import java.util.ArrayList;
import java.util.List;

public class Employees implements Container {

	List<Employee> emps = new ArrayList<Employee>();
	
	public void addEmp(Employee e) {
		emps.add(e);
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
	public EmployeesIterator getIterator() {		
		return new EmployeesIterator();		
	}
	
	public class EmployeesIterator implements Iterator{
		int indicator = 0;
		
		public boolean hasNext() {
			if(indicator < emps.size()) {
				return true;
			}	
			return false;
		}
		
		public Employee current() {
			return emps.get(indicator++);
		}
		
		
	}
	
}
