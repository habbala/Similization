public class Calender {
	public enum Season {
		Spring, Summer, Autumn, Winter
	}

	private int day, year;
	private Season season;

	public Calender(){
		this.day = 24;
		this.year = 1;
		this.season = Season.Spring;
	}

	public void timeTick(){
		day++;
		if(day==75){
			season = Season.Winter;
		}else if(day==50){
			season = Season.Autumn;
		}else if(day==25){
			season = Season.Summer;
		}else if(day==100 || day==0){
			day=1;
			year++;
			season = Season.Spring;
		}
	}

	public Season getSeason(){
		return season;
	}

	public int getDay(){
		return day;
	}

	public int getYear() {
		return year;
	}
}
