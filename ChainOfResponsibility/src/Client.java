
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=50,y=51;
		
        String option = "sub";
        
         Handle h = new BuildChain().createChain();
         h.process(x, y, option);
        
	}

}
