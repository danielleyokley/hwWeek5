package week5;

public class Student {
//pascal case used for Class names/Constructors vs Variables use camel case
//if some properties are going to be shared, use static:
	static int numberOfStudents;
	
	String firstName;
	String lastName;
	String phoneNumber;
	int gradeLevel;
	
	public Student() {}
//constructors
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
//when creating a constructor, do not put a return type
//assigning parameter value to instance value
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.firstName = firstName; 
		this.phoneNumber = phoneNumber; 
		this.gradeLevel = gradeLevel; 
	}
//public methods
	
	public void introduce() {
		System.out.println("Hello, my name is: " + firstName + " " + lastName);
		System.out.println("I am in grade: " + gradeLevel);
		System.out.println("My phone number is: " + phoneNumber);
	}	
//private methods
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}
	
	
//getters and setters - used to get and set data	
	public void setFirstName(String firstName) {
		if (checkLength(firstName, 1)) {
			this.firstName = firstName;
		}

	}
	public String getFirstName() {
		return firstName;
	}
	public void setlastName(String lastName) {		
		if (checkLength(lastName, 1)) {
			this.lastName = lastName;
		}
	}
	public String getLastName() {
		return lastName;
		
	}
	public void setPhoneNumber(String phoneNumber) {
		if (checkLength(phoneNumber, 9)) {
			this.phoneNumber = phoneNumber;
		}
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setGradeLevel(int gradeLevel) {
		if (gradeLevel > 0 && gradeLevel < 13) {
		this.gradeLevel = gradeLevel;
	}
	}
	public int getGradeLevel() {
		return gradeLevel;
	}
}
