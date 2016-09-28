package adapter.example_2;

public class App {
	public static void main(String[] args) {
		Captain captain = new Captain(new BallteFishingBoat());
		captain.fire();
		captain.move();
	}
}
