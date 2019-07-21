package week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String homework) {
		// TODO Auto-generated method stub

		System.out.println(spacedWord(homework));
	}	
		static String spacedWord(String homeowrk) {
		String result = " ";
		for (int i = 0; i < homeowrk.length(); i++) {
			result += homeowrk.charAt(i) + " ";
			
		}
		return result;			
}

		@Override
	public void error(String fatal) {
		// TODO Auto-generated method stub
		System.out.println(errorMessage("ERROR:" + " " + fatal));
		}
		static String errorMessage(String fatal) {
		String result = " ";
		for (int i = 0; i < fatal.length(); i++) {
			result += fatal.charAt(i) + " ";
		
}
		return result;
	}
}