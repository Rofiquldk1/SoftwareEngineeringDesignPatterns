
public  class Rectangle extends Shape {

	public Rectangle(Color c,Color d) {
		super(c,d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Rectangle is drawing");	
		c.fill();
		d.fill();
	}

}
