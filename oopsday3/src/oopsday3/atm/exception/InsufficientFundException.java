package oopsday3.atm.exception;

public class InsufficientFundException extends Exception {

	public InsufficientFundException() {
		// TODO Auto-generated constructor stub
	}
	public InsufficientFundException(String msg) {
		super(msg);
	}
	public String getMessage() {
		return super.getMessage();
	}
	
}
