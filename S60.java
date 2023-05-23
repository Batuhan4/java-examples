package fg;

public abstract class S60 extends Volvo {
	protected int topSpeed = 180;
	
	abstract void engineStart();
	abstract void  showSpeed();
	public abstract void adaptiveCruiseControlSpeed(int currentSpeed);
}
