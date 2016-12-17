package Resources;

import java.util.Random;

public class Food {
	private double totalFood;

	public Food(int startingSupply){
		this.totalFood = startingSupply;
	}

	public double getTotalFood(){
		return totalFood;
	}

	public void gatherFood(double population){
		Random harvest = new Random();
		//for(int i = 0 ; i < (int) population ; i++){
		//	totalFood += harvest.nextInt(8);
		//}
		totalFood += harvest.nextInt(4)*population*0.8;
	}

	public void useFoodSupply(double population){
		totalFood -= population;
	}
}
