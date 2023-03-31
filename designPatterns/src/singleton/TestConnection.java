package singleton;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// Math math= new Math();
		Connection con1= Connection.getConnection();
		Connection con2= Connection.getConnection();
		for(int i=1;i<=10;i++) {// even after running the for loop for 10 times, object won't be created 20 time, only one time the object will be created, and for con2, it will get the reference of the fo
		if(con1.hashCode()==con2.hashCode())
			System.out.println("connection is singleton");
		else
			System.out.println("connection is not a singleton");
		}
	}

}
