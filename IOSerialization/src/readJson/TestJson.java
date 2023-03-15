package readJson;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class TestJson {

	public static void main(String[] args) {

		JSONObject employeeDetails = new JSONObject();
		employeeDetails.put("firstName", "Titus");
		employeeDetails.put("lastName", "Alex");
		employeeDetails.put("dept", "Design");

		JSONObject employeeObject = new JSONObject();
		employeeObject.put("employee", employeeDetails);

		// second employee
		JSONObject employeeDetails2 = new JSONObject();
		employeeDetails2.put("firstName", "Tessy");
		employeeDetails2.put("lastName", "Alex");
		employeeDetails2.put("dept", "IT");

		JSONObject employeeObject2 = new JSONObject();
		employeeObject2.put("employee", employeeDetails2);

		// Add employees to list
		JSONArray employeeList = new JSONArray();
		employeeList.add(employeeObject);
		employeeList.add(employeeObject2);
		
		//Try with resources
		//Write JSON file
		try(FileWriter file =
				new FileWriter("employee.json")FileOtputstream("employee.json")){
				//we can write any JSONArray or JSONObject
				file.write(employeeList.toJSONString());
				file.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
