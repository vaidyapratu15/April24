package LogicalProgramm;

import org.testng.annotations.Test;

public class Reverse_Pallindrome {
	
	
	public void reverseString() {
		
		String org="pratiksha";
		String rev="";
		
		for (int i=org.length()-1; i>=0; i--) {
			
			rev = rev + org.charAt(i);
		}
		System.out.println(rev);
	}
	
	@Test
	public void palllindrome() {
		
		String org="madam";
		String rev="";
		
		for (int i=org.length()-1; i>=0; i--) {
			rev = rev + org.charAt(i);
		}
		System.out.println(rev);
		
		if(org.equals(rev)) {
			System.out.println("Given String is Pallindrom");
		}
		else {
			System.out.println("Given String is NOT Pallindrom");
		}
	}

}
