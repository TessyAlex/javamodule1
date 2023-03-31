package observer.subject;

import observer.iface.WeatherObserver;

public class Observable {

	 public abstract void addObserver(WeatherObserver weatherObserver);
		public abstract void removeObserver(WeatherObserver weatherObserver);
		public abstract void doNotify(); // update







	public void doUpdate(int temperature);
}
