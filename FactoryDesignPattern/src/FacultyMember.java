
public abstract class FacultyMember {
	protected String surname;
	protected String qualification;
	protected String designation;
	
	public String getName() {
	  return surname;
	}
	
	abstract public String getDesignation();
}
