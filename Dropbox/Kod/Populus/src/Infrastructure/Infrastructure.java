package Infrastructure;

public class Infrastructure {
	private double development, coverage;

	public Infrastructure(){
		this.development = 0;
		this.coverage = 0;
	}

	public void improveDevelopment(){
		development++;
	}

	public double getDevelopment(){
		return development;
	}

	public void decreaseDevelopment(){
		development--;
	}

	public void increaseCoverage(){
		coverage++;
	}

	public double getCoverage(){
		return coverage;
	}

	public void decreaseCoverage(){
		coverage--;
	}
}
