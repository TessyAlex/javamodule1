package StateMachine;

public interface StateIface {
	public abstract double amount();//amount calculation and value setting in object array
	public abstract double denomination();
	public abstract double balance(double bln);
}
