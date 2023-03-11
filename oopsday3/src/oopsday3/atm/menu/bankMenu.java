package oopsday3.atm.menu;
import java.util.Scanner;

import oopsday3.atm.exception.InsufficientFundException;

public class bankMenu{
	
bankofAmerica2 boa= new bankofAmerica2();

public bankMenu() {
	
	 Account a1= new Account(101, "John Doe", "salary", 500);
	 Account a2= new Account(102, "Jason Doe", "salary", 500);
	 Account a3= new Account(103, "Joe Doe", "salary", 500);
	 Account a4= new Account(104, "Job Doe", "salary", 500);
	 Account a5= new Account(105, "Jose Doe", "salary", 500);
	 
	 boa.addAccount(a1);
	 boa.addAccount(a2);
	 boa.addAccount(a3);
	 boa.addAccount(a4);
	 boa.addAccount(a5);

}
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		loop: do {
		System.out.println("Enter your choice 1....5");
		System.out.println("1. Display Account");
		System.out.println("2. deposit Amount");
		System.out.println("3. withdraw Amount");
		System.out.println("4. Balance Enquiry");
		System.out.println("5. exit menu");
		choice = scanner.nextInt();
		switch(choice) {
		case 1: {
			System.out.println("Enter account no");
			int actno = scanner.nextInt();
			boa.displayAccount(actno);
			break;
		}
		case 2:{
		System.out.println("Enter account number");
		int actno= scanner.nextInt();
		System.out.println("Enter the amount to deposit");
		int amount= scanner.nextInt();
		double balance = boa.deposit(amount, actno);
		System.out.println(balance);
		break;
		}
		case 3:{
			System.out.println("Enter account number");
			int actno= scanner.nextInt();
			System.out.println("Enter the amount to withdraw");
			int amount= scanner.nextInt();
			double balance= 0;
			try {
				balance=boa.withdraw(amount, actno);
			} catch (InsufficientFundException e) {
				e.printStackTrace();
			}
			System.out.println(balance);
		break;
		}
		case 4:{
			System.out.println("Enter account number");
			int actno= scanner.nextInt();
			System.out.println("Enter the amount to deposit");
			int amount= scanner.nextInt();
			double balance= boa.balanceEnquiry(101);
			System.out.println(balance);
		break;
		}
		case 5:{
		break loop;
		}
		}
		}while(choice!=5);

	
}
}
