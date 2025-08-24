package models;

import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager {

	TwoWheelerSpotManager(List<ParkingSpot> spots, ParkingStrategy strategy) {
		super(spots, strategy);
	}

}
