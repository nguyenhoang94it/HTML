package vehicle.car;

import java.util.ArrayList;
import java.util.Scanner;

import vehicle.Vehicles;

public class Car extends Vehicles{
	private String color;
	Scanner input = new Scanner(System.in);
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	/**
	 * 
	 */
	public Car() {
	
	}

	/**
	 * @param maker
	 * @param model
	 * @param price
	 * @param color
	 */
	public Car(String maker, String model, double price, String color) {
		super(maker, model, price);
		this.color = color;
	}

	public ArrayList<Vehicles> input(){
		System.out.println("=====CAR=====");
		ArrayList<Vehicles> alVehicles = new ArrayList<Vehicles>();
		for(int i = 1; i <= 2; i++){
			System.out.println("==" + i + "==");
			super.input();
			System.out.println("Color: ");
			String color = input.nextLine();
			Car car = new Car(getMaker(), getModel(), getPrice(), color);
			alVehicles.add(car);
		}
		return alVehicles;
	}
	public void display(ArrayList<Vehicles> alVehicles){
		for(Vehicles vehicles : alVehicles){
			System.out.println(vehicles.toString());
		}
	}
	
	@Override 
	public String toString(){
		return super.toString() +  " Color: " + this.color;
	}
	
}
