package week5;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay);

			//super refers to class you are inheriting from
		}


	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return getPay() * 80;
	}


			
		}

