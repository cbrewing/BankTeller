
/*
 * Chamond Brewington
 * Programming Assignment 12
 */
import java.util.Date;
import java.util.Random;

public class BankAccount {
	protected String name;
	protected double balance;
	protected int acctNum;
	protected Date date;

	public BankAccount(String name) {
		this.name = name;
		this.balance = 0;
		this.acctNum = generateAcctNum();
		this.date = new Date();
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double y) {
		if (y > 0.0) {
			balance += y;
			return true;
		} else
			return false;
	}

	public boolean withdraw(double z) {
		if (z >= 0.0 && z <= balance) {
			balance -= z;
			return true;
		} else
			return false;
	}

	public String toString() {
		return name + "[" + acctNum + "]" + "\n" + date + "\n" + "$" + balance;
	}

	public boolean equals(BankAccount that) {
		if (that.acctNum == this.acctNum)
			return true;
		else
			return false;
	}

	protected int generateAcctNum() {
		Random r = new Random();
		String s = r.nextInt(9) + 1 + "";
		for (int i = 1; i <= 8; i++)
			s += r.nextInt(10);
		return Integer.parseInt(s);

	}

	public boolean transfer(BankAccount a, double amnt) {
		if (amnt >= 0.0 && amnt <= balance) {
			withdraw(amnt);
			a.deposit(amnt);
			return true;
		}
		return false;
	}

	public static int getaccountsCreated() {
		return getaccountsCreated();
	}

}
