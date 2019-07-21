package week5;

public class AsteriskLogger implements Logger {


	@Override
	public void log(String fatal) {

	
		System.out.println("***" + fatal + "***");
	}

	@Override
	public void error(String error) {
		
		System.out.println("************************");
		System.out.println("***" + "ERROR:" + error + "***");
		System.out.println("************************");
		}
}
	
