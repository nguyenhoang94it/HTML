package Vehicle;

import java.util.ArrayList;

public class Demo_Vihecle extends Vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehicles> alvehicles = new ArrayList<Vehicles>();
		Demo_Vihecle demo = new Demo_Vihecle();
		alvehicles=demo.input();
		demo.display(alvehicles);
	}

}
