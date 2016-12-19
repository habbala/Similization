import Resources.Food;

public class Population {
	private double populationGrowth, totalPopulation, expectedPopulation;

	public Population(Food food){

		this.totalPopulation = 1;
		populationGrowth = food.getSupply()/this.totalPopulation;
		this.expectedPopulation = totalPopulation + totalPopulation
				* populationGrowth;

	}

	public void updatePopulation(Food food){
		//populationGrowth = (food.getTotalFood()*0.25 + housing) * health;
		populationGrowth = (food.getSupply() / totalPopulation)/10000;
		expectedPopulation += totalPopulation * populationGrowth;
		System.out.println("Growth = "+populationGrowth);
		totalPopulation = expectedPopulation;
	}

	public double getPopulation(){
		return this.totalPopulation;
	}
}
