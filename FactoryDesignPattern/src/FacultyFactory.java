
public class FacultyFactory {
	public FacultyMember getFacultyMember(String surname, String qualification) {
		if (qualification.equals("PhD"))
		   return new PhD(surname,qualification);
		else if (qualification.equals("MSc"))
		   return new MSc(surname,qualification);
		else 
		   return null;
	}

}
