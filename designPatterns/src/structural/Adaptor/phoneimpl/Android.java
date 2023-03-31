package structural.Adaptor.phoneimpl;

import structural.Adaptor.phoneifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone {

	@Override
	public void recharge() {
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}

	}

	@override
	public void useMicroUsb() {
		connector= true;
		System.out.println("MicroUsb connected");

	}

	
	}

}
