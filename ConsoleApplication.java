package week5;

public class ConsoleApplication {

	static Logger logger;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> list = ArrayList<String>();
		Logger logger = new FileLogger();
		logger.info("Hello");
		logger.warning("This is a warning");
		logger.error("Oops, this is an error!");
		logger.fatal("Fatal error");
		
		logger.close();
		
		setLogger(new FileLogger());
		setLogger(new ConsoleLogger());
		
	}
	private static void setLogger(Logger l) {
		logger = l;
	}
}
