package fg;

public class Curve extends Circle {
    private double angle;
	Curve(){
		
	}
	public double getAngle(){
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	public double getArea()
	{
		double area = (angle/360)*PI*radius*radius;
		System.out.println(this.getClass().getSimpleName()+ " getArea method is invoked");
		System.out.println(this.getClass().getSimpleName() +" area value is: " + area);
		return area;
	}

	public void  draw(double val) {
		System.out.println(this.getClass().getSimpleName()+ "draw method is invoked");
		System.out.println("This method draws circle of class " + this.getClass().getSimpleName());
		System.out.println("This method is overloaded with an double parameter the value is : "+ val);
	}
	@Override
	public boolean equals(Object o) {
		System.out.println(this.getClass().getSimpleName()+ " equals method is invoked");
		if (o == null) {
			return false;
		}
		if (this.getClass()!= o.getClass()) {
			return false;
		}
		Curve c = (Curve)o;
		if(Double.compare(radius, c.getRadius())== 0 && color.equals(c.getColor()) && Double.compare(angle, c.getAngle())== 0 ) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return getRadius() + "	" + getColor() + "	" + getAngle();
	}
}
