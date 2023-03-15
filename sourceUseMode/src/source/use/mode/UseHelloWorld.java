package source.use.mode;

import source.mode.HelloWorld;

public class UseHelloWorld {

	public static void main(String[] args) {
		var x="Tessy";
		var y=3.75;
		var z='c';
		
		//x=20;//error
		//System.out.println(x.length());
		try {
			HelloWorld world= new HelloWorld();
			world.message();
		}catch(Exception e) {
		
			e.printStackTrace();
		}
	}

}
