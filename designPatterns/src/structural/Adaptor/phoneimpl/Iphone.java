package structural.Adaptor.phoneimpl;

import structural.Adaptor.phoneifaces.LightningPhone;

public class Iphone implements LightningPhone {
	private boolean connector;

	@Override
	public void recharge() {
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}

	}

	@Override
	public void useLightning() {
		connector= true;
		System.out.println("Lightening connected");

	}

}
