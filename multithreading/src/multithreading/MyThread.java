package multithreading;

public class MyThread extends Thread {
	public String name;
	public MyThread() {
		
	}
	public MyThread(String name) {
		super();
		this.name = name;
	}
	public void run() {
		for(int i=1; i<600;i++)
			System.out.println(name+"="+i);
	}
}
