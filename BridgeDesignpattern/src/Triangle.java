
public class Triangle extends Shape {

	public Triangle(Color c,Color d) {
		super(c,d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle is drawing");	
		c.fill();
		d.fill();
	}

}
