
public class DatabaseProxy implements DatabaseExecutor {
    String name,pass;
    
    
	public DatabaseProxy(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}


	@Override
	public void executeDatabase(String str) {
		DatabaseOriginal dbo = new DatabaseOriginal();
		// TODO Auto-generated method stub
		if(name == "Admin" && pass == "admin"){
			dbo.executeDatabase(str);
		}
		else {
			if(str.equalsIgnoreCase("delete")) {
				System.out.println("You cannot execute query");	
			}
			else {
				dbo.executeDatabase(str);
			}
		}

	}

}
