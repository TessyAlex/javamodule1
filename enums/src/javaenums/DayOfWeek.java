package javaenums;

public enum DayOfWeek {

	MONDAY("Monday"),
	TUESDAY("tuesday"),
	WEDNESDAY("Wednesday"),
	THURSDAY("Thursday"),
	FRIDAY("Friday"),
	SATURDAY("Saturday"),
	SUNDAY("Sunday");
	
	
 private final String name;

  DayOfWeek(String name) {
	this.name = name;
  }
  
  public String getName() {
	  return name;
  }
}
