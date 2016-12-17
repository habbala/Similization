import Resources.*;

import java.util.HashMap;

public class Community {
	private Population population;
	private HashMap<String, Food> resources;

	public Community(int startingLevel){
		this.resources = new HashMap<>();
		resources.put("food", new Food(startingLevel));
		this.population = new Population(resources.get("food"));
	}

	public Population getPopulation(){
		return population;
	}

	public void update(Calender.Season season){
		Food food = resources.get("food");
		food.useFoodSupply(population.getPopulation());

		switch(season){
			case Summer:
				food.gatherFood(population.getPopulation());
				break;

			case Autumn:
				food.gatherFood(population.getPopulation());
				break;

			case Winter:
				break;

			case Spring:
				break;
		}

		population.updatePopulation(food);

	}

	public void printStats(){
		Food food = resources.get("food");

		System.out.println("Population = " + population.getPopulation() + "\n" +
				"Food: "+food.getTotalFood()+"\n");
	}
}
