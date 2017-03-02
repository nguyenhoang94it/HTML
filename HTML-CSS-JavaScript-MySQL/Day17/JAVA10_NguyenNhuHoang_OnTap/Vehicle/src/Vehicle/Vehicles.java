package Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehicles {
	String maker;
	String model;
	double price;

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

	public Vehicles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Vehicles> input() {
		ArrayList<Vehicles> alVehicles = new ArrayList<Vehicles>();
		Scanner scan = new Scanner(System.in);

		System.out.println("Maker: ");
		this.maker = scan.nextLine();
		System.out.println("Model: ");
		this.model = scan.nextLine();
		boolean cont = true;
		do {
			try {
				System.out.println("Price: ");
				this.price = Double.parseDouble(scan.nextLine());
				if (this.price < 0) {
					throw new NumberFormatException("Nhập số lớn 0!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.err.println("Nhập số");
			}
		} while (cont);

		Vehicles vehicles = new Vehicles(maker, model, price);
		alVehicles.add(vehicles);

		return alVehicles;
	}

	public void display(ArrayList<Vehicles> alvehicles) {
		for (Vehicles vehicles : alvehicles) {
			System.out.println(vehicles.toString());
		}
	}
	public String toString() {
		return "Maker " + this.maker + " Model: " + this.model + " Price: " + this.price;
	}

}
