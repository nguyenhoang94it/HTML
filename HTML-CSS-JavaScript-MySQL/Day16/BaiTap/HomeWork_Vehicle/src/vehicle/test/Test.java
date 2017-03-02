package vehicle.test;

import java.util.ArrayList;
import java.util.Scanner;

import vehicle.Vehicles;
import vehicle.car.Car;
import vehicle.truck.Truck;
import exception.NumberMyException;


public class Test {
	public static Scanner input = new  Scanner(System.in);
	public static void main(String[] args) {
		Vehicles vehicles = new Vehicles();
		Car car = new Car();
		Truck truck = new Truck();
		ArrayList<Vehicles> alVehicles1 = new ArrayList<Vehicles>();
		ArrayList<Vehicles> alVehicles2 = new ArrayList<Vehicles>();
		
		boolean cont = true;
		do{
			vehicles.menu();
			boolean cont2 = true;
			int choice = 0;
			do{
				System.out.println("Chọn chức năng");
				try {
					choice = Integer.parseInt(input.nextLine());
					if(choice <= 0 || choice > 5){
						throw new NumberMyException("Nhập vào một chữ số 1 đến 5!");
					}
					cont2 = false;
				} catch (NumberFormatException e) {
					System.err.println("Nhập vào số");
				} catch (NumberMyException e) {
					System.err.println(e.getMessage());
				}
			}while(cont2);
			switch (choice) {
			case 1: {
				alVehicles1 = car.input();
				alVehicles2 = truck.input();
			}
				break;
			case 2: {
				car.display(alVehicles1);
				truck.display(alVehicles2);

			}
			
				break;
			case 3: {
					System.out.println("Danh sách 2 xe car trước khi sắp xếp \n");
					car.display2(alVehicles1);
					System.out.println("\nDanh sách 2 xe truck trước khi sắp xếp \n");
					truck.display2(alVehicles2);
					
					vehicles.sortPrice(alVehicles1);
					vehicles.sortPrice(alVehicles2);
					
					System.out.println("Danh sách 2 xe car sau khi sắp xếp \n");
					car.display2(alVehicles1);
					System.out.println("\nDanh sách 2 xe truck sau khi sắp xếp \n");
					truck.display2(alVehicles2);
				
			}
			
				break;
			case 4: {
					boolean check = true;
					do {
						System.out.println("Nhập mã model car:");
						String searchModel = input.nextLine();
						if(vehicles.searchModel(alVehicles1, searchModel) == null){
							System.err.println("Sai mã ModelQ");
						} else {
							System.out.println(vehicles.searchModel(alVehicles1, searchModel).toString());
							check = false;
						}
					} while (check);
					
			}
			
				break;

			default : System.out.println("goodbye!");
				cont = false;
				break;
			}
			
			
			
		}while(cont);
	}
}
