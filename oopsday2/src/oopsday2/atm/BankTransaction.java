package oopsday2.atm;

public class BankTransaction {

	public static void main(String[] args) {
		BankingIface bom= new BankofAmerica();
		double balance = bom.deposit(250);
		System.out.println("Balance after deposit="+balance);
		balance = bom.withdraw(250);
		System.out.println("Balance after withdraw="+balance);
	}

}
