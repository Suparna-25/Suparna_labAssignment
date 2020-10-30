
/**
 * Desc:To find the sum of the cubes of the digits of an n digit number
 * @author:Suparna Arya
 * date:22/10/2020
 */
import java.util.Scanner;

public class TrafficLightAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Red\n 2.Yellow\n 3.Green");
		System.out.println("Enter your choice[1-3]");
		int choice = sc.nextInt();
		sc.close();
		String display = trafficLight(choice);
		System.out.println(display);
	}

	/**
	 * Display text according to the color of the traffic light
	 * 
	 * @param choice
	 * @return
	 */
	private static String trafficLight(int choice) {
		// TODO Auto-generated method stub
		String disp = null;
		if (choice == 1)
			disp = "Stop";
		else if (choice == 2)
			disp = "Ready";
		else if (choice == 3)
			disp = "Go";
		else
			disp = "Invalid Choice";
		return disp;
	}

}
