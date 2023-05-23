package fg;

public class S60D2 extends S60 {
	String name = "S60 D2";
	int requestedSpeed =0; 
	int currentSpeed = 0;
	int frontCarSpeed;
	int frontCarDistance ;

	public S60D2(int speed) {
		requestedSpeed = speed;
	}
	public void setfrontCarSpeed(int speed) {
		this.frontCarSpeed = speed;
	}
	public void setfrontCarDistance(int distance) {
		this.frontCarDistance = distance;
		
	}
	@Override
	void engineStart() {
		System.out.println("Engine is started!");
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Error! caught Interrupted Exception:  " + e);
		}
		
		System.out.println("Welcome to " + S60D2.name() +" "+ name);
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Error! caught Interrupted Exception:  " + e);
		}
		System.out.println("You want to achieve " +requestedSpeed +" kmh speed" );
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Error! caught Interrupted Exception:  " + e);
		}
		System.out.println("Let's check your speed If It is safe...");
		System.out.println("Limited Top Speed is: " + topSpeed+ " kmh.");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Error! caught Interrupted Exception:  " + e);
		}
		this.showSpeed();
		if(requestedSpeed > 40) {
			System.out.println("Adaptive Cruise Control is active");
			this.adaptiveCruiseControlSpeed(currentSpeed);
		}
		else {
			System.out.println("Adaptive Cruise Control is not available.");
		}
	}


	@Override
	void showSpeed() {
		if(requestedSpeed > topSpeed ) {
			System.out.println("It is not safe to drive at "+requestedSpeed+ " speed!");
			currentSpeed = topSpeed;
		}
		else {
			System.out.println("It is safe to drive at "+requestedSpeed+ " speed!");
			currentSpeed = requestedSpeed;
		}
		
	}
	@Override
	public void adaptiveCruiseControlSpeed(int currentSpeed) {

		
		System.out.println("The front car speed is "+ frontCarSpeed);
		System.out.print("The distance : "+ frontCarDistance + ". ");
		if(currentSpeed > frontCarSpeed && frontCarDistance < 20 ) {
			System.out.println("Emergency Braking is applying!");
		}
		else if(currentSpeed > frontCarSpeed && frontCarDistance >= 20 ) {
			System.out.println("Car is slowing...");
		}
		else {
			System.out.println("Adaptive Cruise is secure and active...");
		}
		
	}


}
