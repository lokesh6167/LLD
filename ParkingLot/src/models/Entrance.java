package models;

public class Entrance {

	ParkingSpotManagerFactory fact;
	ParkingSpotManager manager;
	Vehicle vehicle;
	Entrance(Vehicle vehicle){
		this.vehicle = vehicle;
		fact=new ParkingSpotManagerFactory();
		manager=fact.getManager(vehicle.getVehicleType());
	}
}
