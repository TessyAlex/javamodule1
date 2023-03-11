package oopsday3dotline;

import java.util.Scanner;

public class pmain {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int x1=scanner.nextInt();
		int y1=scanner.nextInt();
		int x2=scanner.nextInt();
		int y2= scanner.nextInt();
		points p1= new points(y2, y2);
		p1.drawLine(x1,y1);
		p1.drawLine(x2,y2);
	}

}
