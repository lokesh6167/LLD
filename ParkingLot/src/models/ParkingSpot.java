package models;

public abstract class ParkingSpot {

	public String id;
	public Vehicle vehicle;
	public Boolean isEmpty;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Boolean getIsEmpty() {
		return isEmpty;
	}
	public void setIsEmpty(Boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	public abstract int getPrice();
	
	
	public void addVehicle(Vehicle vehicle) {
		setIsEmpty(false);
		setVehicle(vehicle);
	}
	
	public void removeVehicle(Vehicle vehicle) {
		setIsEmpty(true);
		setVehicle(null);
	}
	
	
	
}
