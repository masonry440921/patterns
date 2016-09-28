package stategy.example_2;

public class DragonSlayer {
	private DragonSlayingStategy dragonSlayingStategy;
	public DragonSlayer(DragonSlayingStategy dragonSlayingStategy) {
		// TODO Auto-generated constructor stub
		this.dragonSlayingStategy = dragonSlayingStategy;
	}
	
	public void changeStrategy(DragonSlayingStategy dragonSlayingStategy){
		this.dragonSlayingStategy = dragonSlayingStategy;
	}
	
	public void goToBattle(){
		dragonSlayingStategy.execute();
	}
}
