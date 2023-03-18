package isp;

public class UstPermanentEmployee implements BasicDetails, PfDetails {
 
	@Override
	public void updateBasicDetails() {
	System.out.println("update basic details");
		
	}
	@Override
	public void updatePfDetails() {
	System.out.println("update PF details");
		
	}
}
