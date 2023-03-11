package oopsday3a;

public class compare {

	public static void main(String[] args) {
		rectangle r1= new rectangle();
		rectangle r2= new rectangle();
		
		triangle t1= new triangle();
		triangle t2= new triangle();
		
		//comparing primitives
		int a=10;
		int b=35;
		
		boolean result = a==b; // are they equal or not
		System.out.println(result);//false
		//comparing objects 1. comparing references 2. comparing members
		
		result = r1==r2; 
		System.out.println(result);//false
		
		//result = r1==t2; // incompatible types, 2 different classes cannot be compared.
		
	    rectangle r3 = r1;
	    result = r3==r1;
	    System.out.println(result);// true, here the hashCodes of r1 and r3 are the same, therefore it is true, in order to prove , we've printed the hashCode values of r1, r2, r3.
	    System.out.println(r1.hashCode());
	    System.out.println(r3.hashCode());
	    System.out.println(r2.hashCode());
	    
	    result= r1.equals(r2);// not applicable for primitives( can be used for r1 and r2 as they are objects but not for primitives a and b.
	    System.out.println(result);//false
	    
	    result= r1.equals(r3);
	    System.out.println(result);// true
	    
	    r1.setLength(35.5);
	    r1.setBreadth(75.45);
	    
	    r2.setLength(35.5);
	    r2.setBreadth(75.45);
	    
	    if(r1.getBreadth()==r2.getBreadth()&& r1.getLength()==r2.getLength())
	    	System.out.println("they have the same length and breadth");
	    else
	    	System.out.println("they dont have same length and breadth");
	    
	   t1.sets1(35.5);
	   t1.sets2(45.75);
	   t1.sets3(65.5);
	    
	}

}
