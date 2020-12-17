
public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacultyFactory ff=new FacultyFactory();
		FacultyMember fm=ff.getFacultyMember("Rofiq", "PhD");
		System.out.println("hello " + fm.getDesignation() + fm.getName());
		fm=ff.getFacultyMember("kamal", "MSc");
		System.out.println("hello " + fm.getDesignation() + fm.getName());

	}

}
