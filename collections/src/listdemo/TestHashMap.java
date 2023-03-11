package listdemo;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> countryCurr = new HashMap<>();
		countryCurr.put("IND", "Rupe");
		countryCurr.put("USA", "Dollar");
		countryCurr.put("UK", "Pound");
		countryCurr.put(null, null);// null value is allowed

		System.out.println(countryCurr);
		System.out.println(countryCurr.get("IND"));
		
		countryCurr.put("IND", "Rupe");
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsKey("UK"));
		System.out.println(countryCurr.containsValue("Dollar"));
		
		//hashmap has 3 views
		//1. key view
		
		Set<String> Keys = countryCurr.keySet();
		for(String key: keys) {
			System.out.println(key);
		}
		
		//2. values view
		
		Collection<String> values = countryCurr.values();
		for(String value: values) {
			System.out.println(value);
		}
		
		//3.key values together-EntrySet
		
		Set<Entry<String>> entries= countryCurr.entrySet();
		for(Entry<String,String> entry: entries) {
			System.out.println(entry);
		
		
	}

}