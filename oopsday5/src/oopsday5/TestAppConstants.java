package oopsday5;
import another.AppConstants;
//static
import java.lang.Math;
public class TestAppConstants {

	public static void main(String[] args) {
		double salary = 40000;
		double tax=salary*AppConstants.tax_rate;
		double surcharge = salary*AppConstants.sur_charge;
	}
}
