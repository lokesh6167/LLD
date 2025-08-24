package models;

public class Exit {
	public CostComparatorStrategy costStrategy;
	PaymentStrategy strategy;
	
	Exit(CostComparatorStrategy costStrategy,PaymentStrategy strategy){
		this.costStrategy  = costStrategy;
		this.strategy = strategy;
	}
	
	public void completeProcess() {
		double cost = costStrategy.calculateCost();
		
		strategy.pay(cost);
	}
}
