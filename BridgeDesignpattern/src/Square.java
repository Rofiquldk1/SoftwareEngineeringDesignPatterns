
public  class Square extends Shape {

	public Square(Color c,Color d) {
		super(c,d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square is drawing");	
		c.fill();
		d.fill();
	}

}
