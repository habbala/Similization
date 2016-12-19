package Resources;

import java.util.Random;

public class Resource {
	private double supply;

	public Resource(int startingSupply){
		this.supply = startingSupply;
	}

	public double getSupply(){
		return supply;
	}

	public void gather(double population){
		Random harvest = new Random();

		supply += harvest.nextInt(4)*population*0.8;
	}

	public void use(double population){
		supply -= population;
	}
}
