package week5;

public class Managers extends Employee {

	private double bonusPercentage;
	
	public Managers(String firstName, String lastName, double pay, double bonusPercentage) {
		super(firstName, lastName, pay);
		this.bonusPercentage = bonusPercentage;
	}
	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return getPay() * 80 * bonusPercentage;
	}

		
	}
