package HashExample;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;


public class GradesCalculater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		HashMap<String, Float> hm = new HashMap<String, Float>();
		for (int i = 0; i < s; i++) {
		String name = sc.next();
		float number = sc.nextInt();
		hm.put(name, number);
		}
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm = display(hm);
		java.util.Iterator<String> it =  tm.keySet().iterator();
		for (int i = 0; i < s; i++) {
		String n = it.next();
		String fac = tm.get(n);
		System.out.println(n);
		System.out.println(fac);
		}
	}
	
	public static TreeMap<String, String> display(HashMap<String,Float> hm) {
	TreeMap<String, String> tm = new TreeMap<String, String>();
	java.util.Iterator<String> it = hm.keySet().iterator();
	while (it.hasNext()) {
	String id = it.next();
	Float mark = hm.get(id);
	if (mark >= 60) tm.put(id, "PASS");
	else if(mark < 60) tm.put(id, "FAIL");
	else tm.put(id, "FAIL");
	}
	return tm;
	}
}
