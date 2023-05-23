package fg;

public  class  Circle {
	protected double radius;
    protected String color;
    final double PI = 3.14;

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor (String color) {
		this.color = color;
	}
	public double getArea() {
		double area = PI*radius*radius;
		System.out.println(this.getClass().getSimpleName()+ " getArea method is invoked");
		System.out.println(this.getClass().getSimpleName()+" area value is: " + area);
		return area;
	}
	public void  draw() {
		System.out.println(this.getClass().getSimpleName()+ "draw method is invoked");
		System.out.println("This method draws circle of class " + this.getClass().getSimpleName());
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
		Circle c = (Circle)o;
		if(Double.compare(radius, c.getRadius())== 0 && color.equals(c.getColor()) ) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return getRadius() + "	" + getColor();
	}
}
