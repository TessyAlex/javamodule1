package strings;

public class TestStrings {

	public static void main(String[] args) {
		byte bytes[] = {65,66,67,68,69};
		String str= new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str= "Welcome to UST Global";
		bytes = str.getBytes();
		for(byte b: bytes) {
			System.out.println(b);
			
		}
		char chars[]= {'U','S','T',' ','G'};
		
		str = new String(chars);
		System.out.println(str);
		
		str.getChars(0, chars.length-1, chars, 0);
		for(char c: chars) {
			System.out.println(c);
		}
		String string= new String("She sells sea shells in the sea shore");
		int count=0;
		for(int i=0; i< string.length(); i++) {
			char c= string.charAt(i);
			if(c=='s'||c=='S')
				count++;
				
		}
		//System.out.println(count);              // int count=0;
		//String words[]=string.split(" ");       // for(int i=0; i< string.length(); i++) {
		//System.out.println(words.length);       // char c= string.charAt(i);
												// if(c==" ")
												// cout++;
		
		System.out.println(count);              
		String words[]=string.split(" ");       
		System.out.println(words.length); 
		for(String word:words) {
			System.out.println(word);
		}
		string= new String("cartoon");
		System.out.println(string.startsWith("car"));
		System.out.println(string.endsWith("toon"));
		int apos = string.indexOf('a');
		int tpos = string.indexOf('t');
		String string2= string.substring(apos,tpos+1);
			   string2= string.substring(tpos);
			   System.out.println(string2);
		
		 string= new String("madam");
		 int dpos=string.lastIndexOf('d',-1);
		 System.out.println(dpos);
		 string2=string.substring(dpos,string.length());
		 System.out.println(string2);
		 
		 String email= new String("tessyalex@ust.com");
		 int spos=email.lastIndexOf(".com");
		 System.out.println(spos);
		 string2=email.substring(spos, string.length());
		 System.out.println(string2);
		 
		 String str1=new String("welcome");
		 String str2=new String("WELCOME");
		 boolean result = str1.equals(str2);
		 System.out.println(result);
		 
		 int val= str1.compareTo(str2);
		 System.out.println(val);
		
		 string= "bottle";
		 System.out.println(string.toLowerCase());
		 System.out.println(string);
		 System.out.println(string.toUpperCase());
		 System.out.println(string);
		 //string is immutable.
		 
		 
		 
		 
	}
}
	



