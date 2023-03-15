package testLambdas;


public class LambdaSwitchCase {
	
	static double calculate(String operator, double x, double y) {
		return switch(operator) {
		case "+" -> x+y;
		case "-" -> x-y;
		case "*" -> x*y;
		case "/" ->{
			if(y==0) {
				throw new IllegalArgumentException("cant divide by zero");
		}
		yield x/y;
		}
		default-> throw new IllegalArgumentException("Uknown operation");
	};
	
}
	public static void main(String[] args) {
		LambdaSwitchCase lam= new LambdaSwitchCase();
		lam.calculate("+", 55,11 );
		lam.calculate("/", 10, 0);
		lam.calculate("_", 10, 2);
	}
}
