package vehicle.truck;

import java.util.ArrayList;
import java.util.Scanner;

import exception.NumberMyException;
import vehicle.Vehicles;

public class Truck extends Vehicles{
	private int truckload;
	Scanner input = new Scanner(System.in);
	
	
	public int getTruckload() {
		return truckload;
	}


	public void setTruckload(int truckload) {
		this.truckload = truckload;
	}

	/**
	 * 
	 */
	public Truck() {
		
	}

	public Truck(String maker, String model, double price, int truckload){
		super(maker, model, price);
		this.truckload = truckload;
	}
	@Override
	public ArrayList<Vehicles> input(){
		System.out.println("=====TRUCK=====");
		ArrayList<Vehicles> alVehicles = new ArrayList<Vehicles>();
		for(int i = 1; i <= 2; i++){
			System.out.println("==" + i + "==");
			super.input();
			boolean cont = true;
			do {
				try {
					System.out.println("truckload:");
					this.truckload  = Integer.parseInt(input.nextLine());
					if(truckload <= 0){
						throw new NumberMyException("Nhập số lớn hơn 0!");
					}
					cont = false;
				} catch (NumberFormatException e) {
					System.err.println("Enter the number!");
				} catch(NumberMyException e){
					System.err.println(e.getMessage());
				}
			} while (cont);
			
			Truck truck = new Truck(getMaker(), getModel(), getPrice(), truckload);	
			alVehicles.add(truck);
			
		}

		return alVehicles;
	}
	
	@Override
	public void display(ArrayList<Vehicles> alVehicles){
		for(Vehicles vehicles : alVehicles){
			System.out.println(vehicles.toString());
		}
	}
	@Override
	public String toString(){
		return super.toString() + " truckload: " + this.truckload;
	}

}
