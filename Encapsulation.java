package week5;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setFirstName("D");
		student.setPhoneNumber("1234567890");
		student.introduce();
		
		Rectangle rec = new Rectangle(10.0, 15.0); 
		rec.setLength(10.0);
		System.out.println(rec.getArea());
//access modifiers: Public, Private, Protected, No Modifier
//public - accessible anywhere
//protected - accessible within the class, other classes in same package, all subclasses
//private - only accessible from within the class
//no modifier - same as protected, but not accessible in different subclass packages
//most common- public and private
	}

}
