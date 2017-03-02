package vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Vehicles {
	private String maker;
	private String model;
	private double price;
	public Vehicles() {
		super();
	}
	/**
	 * @param maker
	 * @param model
	 * @param price
	 */
	public Vehicles(String maker, String model, double price) {
		super();
		this.maker = maker;
		this.model = model;
		this.price = price;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// override toString
	public String toString(){
		return "Maker " + this.maker + " Model: "  + this.model + " Price: " + this.price ;
	}
	
	
	public ArrayList<Vehicles> input(){
		ArrayList<Vehicles> alVehicles = new ArrayList<Vehicles>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Maker: ");
		this.maker = input.nextLine();
		System.out.println("Model: ");
		this.model = input.nextLine();
		boolean cont = true;
		do {
			try {
				System.out.println("Price: ");
				this.price = Double.parseDouble(input.nextLine());
				if(this.price < 0){
					throw new NumberFormatException("Nhập số lớn 0!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.err.println("enter the number!");
			}
		} while (cont);

		Vehicles vehicles = new Vehicles(maker, model, price);
		alVehicles.add(vehicles);
		
		return alVehicles;
	}
	public void display(ArrayList<Vehicles> alvehicles){
		for(Vehicles vehicles : alvehicles){
			System.out.println(vehicles.toString());
		}
	}
	public void display2(ArrayList<Vehicles> alvehicles){
		int i = 0;
		for(Vehicles vehicles : alvehicles){
			i++;
			if(i > 2) break;
			System.out.println(vehicles.toString());
		}
	}
	public void menu(){
		System.out.println(""
				+ "1.Input \n"
				+ "2.Display \n"
				+ "3.Sort by price \n"
				+ "4.Search by model \n"
				+ "5.Exit \n");
	}
	public void sortPrice(ArrayList<Vehicles> alVehicles){
		Comparator<Vehicles> compPrice = new Comparator<Vehicles>() {
			
			@Override
			public int compare(Vehicles ob1, Vehicles ob2) {
				if(ob1.getPrice() - ob2.getPrice() > 0){
					return 1;
				} else if(ob1.getPrice() - ob2.getPrice() < 0){
					return -1;
				}
				return 0;
			}
		};
		Collections.sort(alVehicles, compPrice);
	}
	
	public Vehicles searchModel(ArrayList<Vehicles> alVehicles, String model){
		for(Vehicles vehicles : alVehicles){
			if(vehicles.getModel().equals(model)){
				return vehicles;
			}
		}
		return null;
	}
//	public static void main(String[] args) {
//		Vehicles v = new Vehicles();
//		v.input();
//	}

}
