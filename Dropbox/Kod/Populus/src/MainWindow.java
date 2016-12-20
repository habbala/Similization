import javax.swing.*;

public class MainWindow {
	private JLabel dateLabel, seasonLabel, populationLabel, foodLabel;
	private JPanel panel;
	private JPanel statistics;
	private JPanel Actions;
	private JButton exitButton;
	private JFrame frame;

	public MainWindow() {

		this.frame = new JFrame("Similization");
		frame.setVisible(true);
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.statistics = new JPanel();
		this.frame.add(statistics);

		this.foodLabel = new JLabel();
		this.populationLabel = new JLabel();
		this.dateLabel = new JLabel();
		this.seasonLabel = new JLabel();

		statistics.add(dateLabel);
		statistics.add(seasonLabel);
		statistics.add(populationLabel);
		statistics.add(foodLabel);
	}

	public void update(Calender calender, Community community){
		dateLabel.setText("Year: " + calender.getYear()+" Day: " +
				""+calender.getDay());
		seasonLabel.setText("Season: "+calender.getSeason());
		populationLabel.setText("Population = " + String.valueOf
				(community.getPopulation().getPopulation()));
		foodLabel.setText("Food = " + String.valueOf(community
				.getResources().get("food").getSupply()));
	}
}

