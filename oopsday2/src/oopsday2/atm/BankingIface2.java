package oopsday2.atm;

public interface BankingIface2 {
	 public abstract double withdraw(double amount, int actno);
	  public abstract double deposit(double amount, int actno);
	  public double balanceEnquiry( int actno);
}
