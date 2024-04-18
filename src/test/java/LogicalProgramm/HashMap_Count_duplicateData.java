package LogicalProgramm;

import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class HashMap_Count_duplicateData {
	

	public void charduplicateData() {
		
		String org = "aabcddddfrrrghtttkjuuu";
		
		HashMap<Character, Integer> map = new 	HashMap<Character, Integer>();
		
		for(int i=0; i<=org.length()-1; i++) {
			char s1 = org.charAt(i);
			
			if(map.containsKey(s1)) {
				map.put(s1, map.get(s1)+1);
			}else {
				map.put(s1, 1);
			}
		}
		
		Set<Character> k = map.keySet();
		for(Character key : k) {
			System.out.println(key + ":"+ map.get(key));
		}
		
		System.out.println("++++++++++++  Duplicate data only +++++++++");
		
		Set<Character> k1 = map.keySet();
		for(Character key : k1) {
			if (map.get(key)>1) {
				System.out.println(key + ":"+ map.get(key));	
			}
		}
		
				
	}
	@Test
	public void CountRepetatingPara() {
		
		String org = "abc abc abc bc cd cd zx zx";
		String [] ar = org.split(" ");
		
		HashMap<String, Integer>mp = new HashMap<String, Integer>();
		
		for (int i=0; i<=ar.length-1; i++) {
			String s1 = ar[i];
			
			if (mp.containsKey(s1)) {
				mp.put(s1, mp.get(s1)+1);
			}else {
				mp.put(s1, 1);
			}
			
		}
		
		Set <String> k = mp.keySet();
		
		for (String key : k) {
			System.out.println(key + " : "+ mp.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
