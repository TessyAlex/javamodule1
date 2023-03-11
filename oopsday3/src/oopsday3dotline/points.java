package oopsday3dotline;

public class points implements line {
	private int x;
	private int y;
	
	public points(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
		
		public int getx() {
			return x;	
		}
		
		public void setx(int x) {
			this.x = x;
			
		}
		public int gety() {
			return y;	
		}
		
		public void sety(int y) {
			this.y = y;
		
	}
		

	@Override
	public void drawLine(int x, int y) {
		for(x=0;x<10;x++)
		System.out.println(".");
	}

}
