package exceptionsday6;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		System.out.println("program task begins");
		try {
			System.out.println("from try");
			int c= 10/0;
			System.out.println("from try after exception");
		}catch(Exception e){
			System.out.println("from catch");//never leave catch block empty
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
		System.out.println("from finally");
	}
		System.out.println("program ended");
	}

}
