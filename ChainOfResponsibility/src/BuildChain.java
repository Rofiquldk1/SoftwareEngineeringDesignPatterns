
public class BuildChain {
	
	public Handle createChain() {
		 Handle ad = new Addition();
	     Handle ad2 = new Subtraction();
	     Handle ad3= new Multiplication();
	     Handle ad4 = new Division();
	     Handle ad5 = new Mod();

	        
	     ad.next(ad2);
	     ad2.next(ad3);
	     ad3.next(ad4);
	     ad4.next(ad5);
	     
	     return ad;
	}

}
