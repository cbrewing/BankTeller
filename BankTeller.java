import java.util.Scanner;

public class BankTeller {
	private static Bank account = new Bank(2);

public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	char command;
	printview();
	do {System.out.println("\n Please enter a command or typr");
	command = input.nextLine().toLowerCase()args.charAt(0);
	
	switch (command){
	case 'a':
	int savingsAndCheckings;
	while (savingsAndCheckings < 1 || savingsAndCheckings > 2){
		System.out.print("\n Enter 1 for Savings Account or 2 for Checkings Account:");
	}
	savingsAndCheckings = Integer.parseInt(input.nextLine());
	}
	System.out.print("Enter account holder name):");
	String name = input.nextLine();
	System.out.print("Enter starting check number:");
	int check = input.nextInt();
	System.out.print("Enter account Number:");
	int date = Integer.parseInt(input.nextLine());
	
	BankAccount b;
	if( savingsAndCheckings == 1){
		System.out.print("Enter interest rate:");
		int rate =  Integer.parseInt(input.nextLine());
		b = new SavingsAccount (name , rate);
		
	}
	else
		System.out.print("Enter starting check number");
	int c = Integer.parseInt(input.nextLine());
	b = new CheckingsAccount (name, c);
	
	if (account.add(b)){
		System.out.print("\n Bank account successfully added. \n");}
		else
			System.out.print("Account not added. No repeats please\n");
		break;
		case 'b':
			System.out.print("\n Enter account number:");
			int acctNum = Integer.parseInt(input.nextLine());
			if(account.remove(account.find(acct))){
				System.out.print("\n Account Successfully removed. \n");}
				else
					System.out.print("Account not found. Cannot remove. \n");
				break;
				
				case 'c':
					System.out.print(account.toString());
					break;
					
				case'd':
					System.out.println("\n There are" + account.getCount() + "Accounts in the bank");
					
				case '?':

	print Menu();break;

	case'q':System.out.print("Good Bye");break;

	default:System.out.print("Invalid input.");

}}while(command!='q');input.close();

public static void printMenu(){
	System.out.print("Bank Teller Options \n ----------------------------------- \n a: add an account to the bank \n b: remove an account from the bank \n c: display the accounts in the bank \n d: count the accounts in the bank \n e: sort the accounts in the bank \n f: update an account in the bank \n ?: display the menu again \n q: quit this program");
}
}}
