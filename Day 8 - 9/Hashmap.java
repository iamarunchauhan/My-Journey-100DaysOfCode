package arunLearningArrays;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		print(map);
		map.put("abc", 20);
		map.put("def", 30);
		map.put("ghi", 10);
		map.put("xyz", 90);
		
		System.out.println("The size of map is -> " + map.size());
		
		print(map);
		
		if(map.containsKey("xyz")) {
			int value = map.get("xyz");
			
			System.out.println("Value of \"xyz\" is -> " + value);
		}
		
		map.clear();
		System.out.println(map);
	}
	
	public static void print(Map<String, Integer> map) {
		if(map.isEmpty()) {
			System.out.println("Map is Empty");
		} else {
			System.out.println(map);
		}
	}
	
}
