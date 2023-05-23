package fg;

public class  Cylinder extends Circle {
   private double height;
   
   Cylinder(){
	   
   }
   
   public double getHeight() {
	   return height;
   }
   public void setHeight(double height) {
	   this.height = height;
   }
   public double getArea() {
	   double area = 2*PI*radius*(radius + height);
	   System.out.println(this.getClass().getSimpleName()+ " getArea method is invoked");
	   System.out.println(this.getClass().getSimpleName() +" area value is: " + area);
	   return area;
   }

	public void  draw(int val) {
		System.out.println(this.getClass().getSimpleName()+ "draw method is invoked");
		System.out.println("This method draws circle of class " + this.getClass().getSimpleName());
		System.out.println("This method is overloaded with an int parameter the value is : "+ val);
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
		Cylinder c = (Cylinder)o;
		if(Double.compare(radius, c.getRadius())== 0 && color.equals(c.getColor()) && Double.compare(height, c.getHeight())== 0 ) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return getRadius() + "	" + getColor() + "	" + getHeight();
	}
}
