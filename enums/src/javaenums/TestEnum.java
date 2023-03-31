package javaenums;

public class TestEnum {

	public static void main(String[] args) {
		
		DayOfWeek today= DayOfWeek.SATURDAY;
		System.out.println("Today is"+ today.getName());
		//this would output: Today is Saturday
		
		switch(today) {
		
		case MONDAY:
					
			System.out.println("Work hard");
			break;
					
		case TUESDAY:
			
			System.out.println("Work little more");
			break;
			
		case WEDNESDAY:
			
			System.out.println("Work work little more hard");
			break;
			
		case THURSDAY:
			
			System.out.println("Work work more, weekend is around");
			break;
			
		case FRIDAY:
			
			System.out.println("Yeah....weekend has arrived");
			break;
			
		case SATURDAY:
			
			System.out.println("Enjoy morning coffee, go shopping");
			break;
			
		case SUNDAY:
			
			System.out.println("do cleaning work, snoooooozeeee");
			break;
		}
	}

}
