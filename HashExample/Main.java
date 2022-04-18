package HashExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
		 
		public static void main(String[] args) throws NumberFormatException, IOException {
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
		  hm.put(Integer.parseInt(br.readLine()), br.readLine());
		}
		getvalues(hm);
		}
		public static void getvalues(HashMap<Integer, String> hm) {
		int count=0;
		Iterator<Integer>itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
		int n=itr.next();
		if(n%4!=0)
		{
		count++;
		}
		}
		System.out.println(count);
		}

}
