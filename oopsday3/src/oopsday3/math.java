package oopsday3;

public class math {

	public static void main(String[] args) {
		mathIface op = new operations(5);// interface object= new class name/ class name object= new class name.
				op.positiveOrNegative();
				op.evenOrOdd();
				op.sumOfNNumbers();
				op.factorial();
				op.primeOrNot();
				op.reverse();
				op.amstrong();
				
	}

}
