
public class Employee {
	private String name;
	private String id;
	private double salary;
	
	public Employee (String n,String i,double s){
		name=n;
		id=i;
		salary=s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}
