package LogicalProgramm;

import org.testng.annotations.Test;

public class No_of_white_spaces {
	
	
	public void noOfwhiteSpaces() {
		 
		String str = "a  b  d      h";
		int count=0;
		
		for (int i=0; i<=str.length()-1; i++) {
			
			char str1 = str.charAt(i);
			if (str1 == ' ') {
				count ++;
			}
		}
			System.out.println(count);
			
	}
	
	@Test
	public void replaceSpace() {
		
		String str= "a b c d";
		
		System.out.println(str.replace(" ", ""));
	}
	

}
