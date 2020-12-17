
public class Mod implements Handle {
    private Handle nextObject;

	@Override
	public void process(int x,int y,String op) {
		// TODO Auto-generated method stub
		int z=x%y;
       if(op.equalsIgnoreCase("mod")) {
    	   System.out.println(x+" % "+y+" = "+z);
       }
       else {
    	   System.out.println("Invalid Operation");
       }
	}

	@Override
	public void next(Handle h) {
		this.nextObject=h;
	}


}
