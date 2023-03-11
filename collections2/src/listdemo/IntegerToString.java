package listdemo;

public class IntegerToString {

	public static void main(String[] args) {
		
	
	int i=12321;
	String str= i+"";
	StringBuilder sb= new StringBuilder(str);
	sb.reverse();
	System.out.println(sb);
}
}

