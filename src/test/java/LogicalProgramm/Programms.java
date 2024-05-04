package LogicalProgramm;

import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class Programms {
	

	
    private String[] ar;

	@Test 
	public void program() {

		String org = "hello hello world";
      
		String s1 [] = org.split(" ");
		
	   HashMap<String , Integer> mp = new HashMap<String , Integer>();
		
		for (int i=0; i<=s1.length-1; i++){
		  
			 String s = s1[i];
			 
			 if (mp.containsKey(s)){
			   mp.put(s , mp.get(s) + 1);
			 }else {
			   mp.put(s , 1);
			 }
		  
	 }
		
		Set<String > keys = mp.keySet();
		
		for ( String key : keys){
		if (mp.get(key)>1){  
			System.out.println(key + " : " + mp.get(key));
		  }
		}
		
		
		
		
	


		



















		
		
	}

}
