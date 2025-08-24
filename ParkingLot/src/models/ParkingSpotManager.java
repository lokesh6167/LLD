package models;

import java.util.List;

public abstract class ParkingSpotManager {

	List<ParkingSpot> parkingSpots;
	
	ParkingStrategy strategy;
	
	ParkingSpotManager(List<ParkingSpot> spots, ParkingStrategy strategy){
		parkingSpots=spots;
		this.strategy=strategy;
	}
	
	public ParkingSpot getFreeSpot(Vehicle vehicle) {
		for(ParkingSpot spot : parkingSpots) {
			if(spot==null) {
				return spot;
			}
		}
		return null;
	}
	
	public void addParkingSpots(ParkingSpot spot) {
		parkingSpots.add(spot);
	}
	
	public void removeParkingSpot(ParkingSpot spot) {
		parkingSpots.remove(spot.getId());
	}
	
}
