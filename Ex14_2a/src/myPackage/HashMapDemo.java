package myPackage;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer>mountains = new HashMap<String,Integer>();
		mountains.put("Everest",29029);
		mountains.put("Everest",28251);
		mountains.put("Kangchenjunga",28169);
		mountains.put("Denali",20335);
		printMap(mountains);
		System.out.println("size" + mountains.size());
		
		System.out.println("Denali in the map: " + mountains.containsKey("Denali"));
		System.out.println();
		System.out.println("Changing height of Denali.");
		mountains.put("Denali",20320);
		printMap(mountains);
		
		System.out.println("Removing Kangchenjunga.");
		mountains.remove("Kangchenjunga");
		printMap(mountains);
		//mountains.clear();
		System.out.println("1." + mountains);
		System.out.println("2." + mountains.isEmpty());
		System.out.println("3." + mountains.size());
		System.out.println("4." + mountains.keySet());
		System.out.println("5." + mountains.get("Denali"));
	}

	private static void printMap(HashMap<String, Integer> map) {
		System.out.println("Map contains:");
		for(String mountainName : map.keySet()){
			Integer height = map.get(mountainName);
			System.out.println(mountainName + "->" + height.intValue() + "feet.");
		}
		System.out.println();
		
	}

}
