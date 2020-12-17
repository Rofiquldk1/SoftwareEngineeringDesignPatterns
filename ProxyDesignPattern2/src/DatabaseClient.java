
public class DatabaseClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseProxy dp = new DatabaseProxy("Admin","admin");
		dp.executeDatabase("delete");
		
	}

}
