package models;

public class HourlyBasedCostCalculator implements CostComparatorStrategy {

	@Override
	public double calculateCost() {
		return 100;
	}

}
