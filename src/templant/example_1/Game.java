package templant.example_1;

public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	public final void play(){
		initialize();
		startPlay();
		endPlay();
	}

}
