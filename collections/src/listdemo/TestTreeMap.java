package listdemo;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.TestTree;
import java.util.Set;

public class TestTreeMap {

public static void main(String[] args) {
		
		TestTree<String, String> countryCurr = new TestTree<>();
		countryCurr.put("IND", "Rupe");
		countryCurr.put("USA", "Dollar");
		countryCurr.put("UK", "Pound");

		System.out.println(countryCurr);
		System.out.println(countryCurr.get("IND"));
		
		countryCurr.put("IND", "Rupe");
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsKey("UK"));
		System.out.println(countryCurr.containsValue("Dollar"));
		
		//hashmap has 3 views
		//1. key view
		
		Set<String> Keys = countryCurr.keySet();
		for(String key: Keys) {
			System.out.println(key);
		}
		
		//2. values view
		
		Collection<String> values = countryCurr.values();
		for(String value: values) {
			System.out.println(value);
		}
		
		//3.key values together-EntrySet
		
		Set<Entry<String, String>> entries= countryCurr.entrySet();
		for(Entry<String, String> entry: entries) {
			System.out.println(entry);
		
	}

}
}
//null value is not allowed
