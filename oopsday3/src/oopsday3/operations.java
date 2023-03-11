package oopsday3;

public class operations implements mathIface {
	private int number;
	
	public operations(){
	
	}
	

	public operations(int number) {
		super();
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	
	@Override
	public void positiveOrNegative() {
		if(number>0)
			System.out.println("This is a positive number");
		else
			System.out.println("This is a negative number");
	}

	@Override
	public void evenOrOdd() {
		if(number%2==0)
			System.out.println("This is an even number");
		else
			System.out.println("This is an odd number");
	}

	@Override
	public void sumOfNNumbers() {
		int sum=0;
		for(int i=1;i<=number;i++)
			sum=sum+i;
			System.out.println("sum="+sum);
	}

	@Override
	public void factorial() {
		int fact=1;
		for(int i=1;i<this.number;i++) {
			fact=fact*i;
		}
			System.out.println("fact="+fact);
	
	}
	@Override
	public void primeOrNot() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void amstrong() {
		// TODO Auto-generated method stub

	}

}
