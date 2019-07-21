package week5;

public class InheritanceAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	List<String> list = new ArrayList<String>();
		Employee salary = new SalariedEmployee("Davy", "Jones", 5200.00);
		Employee hourly = new HourlyEmployee("Jack", "Sparrow", 37.00, 80.5);
		Employee manager = new Managers("Will", "Turner", 2000.00, 10.5);
		
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
	}

}
