
/**
 * Java OOP  project
 * @author Siphiwe Khoza
 * 29 October 2017
 */
public class AutoMobile {
	private static String manufacturer;
	private static int numberofCylinders;
	private static int speed;

	public AutoMobile() {

	manufacturer= "Vauxhall";
	numberofCylinders= 4;
	speed= 200;
		
	}

	public AutoMobile(int speed2, int numberofCylinders2, String manufacturer2) {
		// TODO Auto-generated constructor stub
	}

	public String getManufacturer() {
		return "Ford";
	}

	public int getNumberofCylinders() {
		return 3;
	}

	public  int getSpeed() {
		return 250;
	}

	public void setManufacturer(String manufacturer) {
		AutoMobile.manufacturer = manufacturer;
	}

	public void setNumberofCylinders(int numberofCylinders) {
		AutoMobile.numberofCylinders = numberofCylinders;
	}

	public void setSpeed(int speed) {
		AutoMobile.speed = speed;
	}

	public void addGas() {

		int fuelevel = 5;

		if (fuelevel >= 5) {
			System.out.println("add fuel");
		} else {
			System.out.print("fuel level is fine");
		}

	}

	public void Accelerate() {
		
			int acc= 20;
		if (acc<20 ){
			System.out.println("too fast");
		} else {
			System.out.println("Too slow, speed up");
		}

	}
	
	

	public boolean hasSameName(AutoMobile otherAutoMobile) {
		return this.hasSameName(otherAutoMobile);

	}

	public void WriteOutput() {
		// TODO Auto-generated method stub
		System.out.println("speed :" + speed);
		System.out.println("manufacturer :" + manufacturer);
		System.out.println("numberofCylinders :" + numberofCylinders);
	}

}
