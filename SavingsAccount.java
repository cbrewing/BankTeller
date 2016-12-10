
public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(String a, double b) {
		super(a);
		if (interestRate > .1 && interestRate < 0) {
			interestRate = .01;
		}

	}

	public double getRate() {
		return interestRate;
	}

	public String toString() {
		return ("Interest Rate" + "+%1.3f" + interestRate + super.toString());
	}

	public void addInterest() {
		balance += (balance * interestRate);
	}
}
