package chain.example_2;

public abstract class Abstractlogger {
	public static int INFO = 1;
	public static int ERROR = 2;
	public static int DEBUG = 3;
	
	protected int level;
	protected Abstractlogger nextlogger;
	public void setNextlogger(Abstractlogger nextlogger) {
		this.nextlogger = nextlogger;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public Abstractlogger() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void logMessager(int level,String message){
		if(this.level <= level){
			write(message);
		}
		
		if(nextlogger != null){
			nextlogger.logMessager(level, message);
		}
	}
	
	
	public abstract void write(String message);
	
}
