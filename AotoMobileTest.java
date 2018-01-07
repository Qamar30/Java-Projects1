/**
 *Driver Class 
 * @author Siphiwe Khoza
 * 29 October 2017;
 * 
 */
public class AotoMobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AutoMobile Rover = new AutoMobile();

		// Testing methods for AutoMobile Class

		System.out.println(Rover.getManufacturer());

		System.out.println(Rover.getNumberofCylinders());

		System.out.println(Rover.getSpeed());
		
		Rover.WriteOutput();
		Rover.Accelerate();
		Rover.addGas();

		Rover.setManufacturer("Bauman");
		Rover.setNumberofCylinders(4);
		Rover.setSpeed(110);

		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		
		// Testing methods for SportsCar Class
		
		SportsCar b= new SportsCar();
		System.out.println(b.getCarModel());
		b.setCarModel("Porsche");
		b.Writeoutput();
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		

	}

}
