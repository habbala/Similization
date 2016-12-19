import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Simulation {
	public static void main(String[] args) {
		int startingLevel = 200;

		Calender calender = new Calender();
		Community community = new Community(startingLevel);

		ScheduledExecutorService ses =
				Executors.newSingleThreadScheduledExecutor();

		ses.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				calender.timeTick();
				community.update(calender.getSeason());
				community.printStats();
				System.out.println("Season: "+calender.getSeason()+" Year: " +
						""+calender.getYear()+" Day: "+calender.getDay()+"\n");
			}
		}, 0, 1, TimeUnit.SECONDS);

		if(community.getPopulation().getPopulation() <= 0){
			ses.shutdown();
		}

	}
}
