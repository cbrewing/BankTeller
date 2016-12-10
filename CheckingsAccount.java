
public class CheckingsAccount extends BankAccount {
	private int checkNumber;

	public CheckingsAccount(String a, int b) {
		super(a);
		if (b > 0){
				return checkNumber;
		}
	}

	public int getCheckNumber() {
		return checkNumber;
	}

	public String toString() {
		return ("Check Number" + checkNumber + super.toString());
	}

	public void writeCheck() {
		checkNumber++;
	}
}
