
public class PhD extends FacultyMember {
	
	public PhD(String surname, String qualification) {
		this.surname=surname;
		this.qualification=qualification;
		this.designation="Dr. ";	
	}
	
	public String getDesignation() {
		return (designation);
	}

}
