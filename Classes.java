package week5;

public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		
		Student student1 = new Student();
		student1.firstName = "Danielle";
		student1.lastName = "Yokley";
		student1.gradeLevel = 13;
		student1.phoneNumber = "012-345-6789";

		student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tom", "Riddle", "098-765-4321", 9);
		student3.introduce();
	}

}
