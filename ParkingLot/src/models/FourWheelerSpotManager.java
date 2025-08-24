package models;

import java.util.List;

public class FourWheelerSpotManager extends ParkingSpotManager {

	FourWheelerSpotManager(List<ParkingSpot> spots, ParkingStrategy strategy) {
		super(spots, strategy);
	}

}