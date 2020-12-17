
public class Multiplication implements Handle {
    private Handle nextObject;

	@Override
	public void process(int x,int y,String op) {
		// TODO Auto-generated method stub
		int z=x*y;
       if(op.equalsIgnoreCase("mul")) {
    	   System.out.println(x+" * "+y+" = "+z);
       }
       else {
    	   nextObject.process(x, y, op);
       }
	}


	@Override
	public void next(Handle h) {
		this.nextObject=h;
	}


}
