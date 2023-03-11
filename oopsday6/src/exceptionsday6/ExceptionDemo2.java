package exceptionsday6;

public class ExceptionDemo2 {
	// args: command line arguments
	public static void main(String[] args) { //as args is given as string
		try {
		int b= Integer.parseInt(args[0]); // STRING (i.e, number given in qoutes("10"))WILL GET CONVERTED TO INT
		int a= Integer.parseInt(args[1]);
		int c= b/a;
		String name= args[2];
		int data[]= {a,b};
		System.out.println("program task completed");
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		
		} catch(NumberFormatException e) {
		      e.printStackTrace();
	}catch(Exception e) { // mother of exception
		e.printStackTrace();
	}
		System.out.println("program completed");
	}

}
