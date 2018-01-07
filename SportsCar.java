/**
 * Derived Class 
 * @author Siphiwe khoza
 *29 0Ctober 2017
 */
public class SportsCar extends AutoMobile {

	private String carModel;

	public SportsCar() {

		super();
		setCarModel("ford");

	}

	public SportsCar(int speed, int numberofCylinders, String manufacturer, String carModel) {

		super(speed, numberofCylinders, manufacturer);

		this.setCarModel(carModel);

		speed = speed;
		numberofCylinders = numberofCylinders;
		manufacturer = manufacturer;

	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public void Writeoutput() {

		System.out.println("CarModel:" + carModel);

	}




public boolean equals(SportsCar otherSportsCar)
{
    return(this.hasSameName(otherSportsCar))
            && this.carModel.equalsIgnoreCase(carModel);
}
}
