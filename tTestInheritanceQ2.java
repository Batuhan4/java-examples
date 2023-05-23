package fg;

public class tTestInheritanceQ2 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Cylinder cyl1= new Cylinder();
		Cylinder cyl2= new Cylinder();
		Curve cur1 = new Curve();
		Curve cur2 = new Curve();
		
		
		c1.setRadius(5);
		cyl1.setRadius(4);
		cur1.setRadius(3);
		
		cyl1.setHeight(10);
		cur1.setAngle(30.0);
		
		c2.setRadius(5);
		cyl2.setRadius(4);
		cur2.setRadius(3);
		
		cyl2.setHeight(10);
		cur2.setAngle(20.0); // curve is differ angle
		
		
		c1.setColor("Yellow");
		cyl1.setColor("Blue");
		cur1.setColor("Red");
		
		c2.setColor("Yellow");
		cyl2.setColor("Blue");
		cur2.setColor("Red");
		
		
		System.out.println(c1.equals(c2));
		System.out.println(cyl1.equals(cyl2));
		System.out.println(cur1.equals(cur2));

		
		
		System.out.println(c1);
		System.out.println(cyl1);
		System.out.println(cur1);

	}

}
