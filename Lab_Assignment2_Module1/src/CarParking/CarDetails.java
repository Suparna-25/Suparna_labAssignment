/**
 * Desc:A java class used to descride car details for parking system
 * @author Suparna Arya
 * Date:23/11/2020
 *
 */
package CarParking;

public class CarDetails {
	/*
	 * This variable contains owner's name.
	 */
	private String ownerName;
	/*
	 * This variable contains car's registation number.
	 */
	private String car_reg_no;

	/*
	 * This constructor initialize all the data members of car class
	 */
	public CarDetails(String ownerName, String car_reg_no) {
		this.ownerName = ownerName;
		this.car_reg_no = car_reg_no;
	}

	/*
	 * All the setters and getters are described below
	 */
	public String displayOwner() {
		return ownerName;
	}

	public String displayCarReg() {
		return car_reg_no;
	}

}
