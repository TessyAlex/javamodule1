package strings;

public class TestStrings2 {

	public static void main(String[] args) {
		 String string=new String("16-11-477/6/A/3 Hyderabad 500036");
		 int digit=0;
		 int letter=0;
		 int ntdl=0;
		 for(int i=0;i<string.length();i++) 
		 {
			 char c= string.charAt(i);
		 	if(Character.isDigit(c)) 
		 	{
		 		digit++;
		 	}
		 	else if(Character.isLetter(c))
		 	{
		 		letter++;
		 	}
		 	else {
		 	ntdl++;
		 	}
		 }
		 	System.out.println(digit);
		 	System.out.println(letter);
		 	System.out.println(ntdl);
	}

}
