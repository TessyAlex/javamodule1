package oopsday2.shape;

	
	public class rectangle implements shapeIface {
		
		private int length;
		private int breadth;
		
		public rectangle() {
		
}

		public rectangle(int length, int breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
		}
		public int getlength() {
			return length;	
		}
		
		public void setlength(int length) {
			this.length = length;
		}
		
		public double getbreadth() {
			return breadth;
		}
		
		public void setBreadth(int breadth) {
			this.breadth = breadth;
		}
		
		public void area() {
			int area=length * breadth;
			System.out.println(area);
		}

		@Override
		public String toString() {
			return "rectangle [length=" + length + ", breadth=" + breadth + "]";
		}
		
}