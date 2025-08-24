package models;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManagerFactory {
	public ParkingSpotManager getManager(VehicleType vehicleType) {
		List<ParkingSpot> spots = new ArrayList<>();
		return new TwoWheelerSpotManager(spots, new NearestToTheEntrance());
	}
}
