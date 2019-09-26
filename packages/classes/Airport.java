package packages.classes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Airport {
	HashMap<String, Integer> planes;
	HashMap<String, String> flights;
	Scanner reader;
	
	public Airport() {
		this.planes = new HashMap<String, Integer>();
		this.flights = new HashMap<String, String>();
		this.reader = new Scanner(System.in);
	}
	
	public void airportPanel() {
		System.out.println("Airport panel\r\n" + 
						   "--------------------");
		
		String choice = "";
		while (!choice.equals("x")) {
			System.out.println("\r\nChoose operation:\r\n" + 
					"[1] Add airplane\r\n" + 
					"[2] Add flight\r\n" + 
		   			"[x] Exit");
			System.out.print("> ");
			choice = reader.nextLine();

			switch (choice) {
			case "1":
				addPlane();
				break;
			case "2":
				addFlight();
				break;
			}
		}
		flightService();
			
	}
	
	public void addPlane() {
		System.out.print("Give plane ID: ");
		String id = reader.nextLine();
		
		System.out.print("Give plane capacity: ");
		Integer capacity = Integer.parseInt(reader.nextLine());;
		
		this.planes.put(id, capacity);
	}
	
	public void addFlight() {
		System.out.print("Give plane ID: ");
		String id = reader.nextLine();
		
		System.out.print("Give departure airport code: ");
		String departure = reader.nextLine();
		
		System.out.print("Give destination airport code: ");
		String destination = reader.nextLine();
		
		this.flights.put(id, departure + "-" + destination);
	}
	
	public void flightService() {
		System.out.println("Flight service\r\n" + 
				"------------");
		String choice = "";
		while (!choice.equals("x")) {
			System.out.println("\r\nChoose operation:\r\n" + 
					"[1] Print planes\r\n" + 
					"[2] Print flights\r\n" + 
					"[3] Print plane info\r\n" + 
					"[x] Quit\r\n");
			System.out.print("> ");
			choice = reader.nextLine();
		
			switch (choice) {
			case "1":
				printPlanes();
				break;
			case "2":
				printFlights();
				break;
			case "3":
				printPlaneInfo();
				break;
			}
		}
	}
	
	public String printPlane(String id) {
		return id + "(" + this.planes.get(id) + " ppl)";
	}
	
	public void printPlanes() {
		for (String id : this.planes.keySet()) {
			System.out.println(printPlane(id));
		}
	}
	
	
	public void printFlights() {
		for (String id : this.flights.keySet()) {
			System.out.println(printPlane(id) + " (" + this.flights.get(id) + ")");
		}
	}
	
	public void printPlaneInfo() {
		System.out.print("Give plane ID: ");
		String id = reader.nextLine();
		
		System.out.println(printPlane(id));
	}
	
}
