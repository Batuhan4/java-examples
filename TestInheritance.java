package fg;

public class TestInheritance {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Cylinder cyl1= new Cylinder();
		Curve cur1 = new Curve();
		
		c1.setRadius(5);
		cyl1.setRadius(4);
		cur1.setRadius(3);
		
		cyl1.setHeight(10);
		cur1.setAngle(30.0);
		
		c1.setColor("Yellow");
		cyl1.setColor("Blue");
		cur1.setColor("Red");
		
		c1.getArea();
		cyl1.getArea();
		cur1.getArea();
		
		
		c1.draw();
		cyl1.draw();
		cur1.draw();
		
		cyl1.draw(20);
		c1.draw();
		cur1.draw(10.0);
	}

}
