package chain.example_2;

public class App {
	private static Abstractlogger getChainOfLoggers(){
		Abstractlogger error = new ErrorLogger(Abstractlogger.ERROR);
		Abstractlogger debug = new DebugLogge(Abstractlogger.DEBUG);
		Abstractlogger console = new ConsoleLogger(Abstractlogger.INFO);
		
		error.setNextlogger(debug);
		debug.setNextlogger(console);
		return console;
	}
	
	public static void main(String[] args) {
		Abstractlogger logger = getChainOfLoggers();
		
		logger.logMessager(Abstractlogger.INFO, "fuck");
		logger.logMessager(Abstractlogger.DEBUG, "your");
		logger.logMessager(Abstractlogger.ERROR, "mother");
	}
}
