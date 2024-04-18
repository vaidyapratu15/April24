package LogicalProgramm;

import org.testng.annotations.Test;

public class reverseNumber {
	
   public void reversenumber() {
	 
   int orgnum = 1234;
   String org = Integer.toString(orgnum);
   
   String rev= " ";
   for (int i=org.length()-1; i>=0; i--) {
	   rev = rev + org.charAt(i);
   }
   
   int revnum = Integer.parseInt(rev);
   System.out.println(revnum);
   
   }
   
   
   @Test
   public void withoutStringReverseNum() {
	   
		int num = 12345;
		int revnum =0;
		
		for(int i=num; i>0; i=i/10) {
			
			int rem = i%10;
			revnum = revnum*10 + rem;
		}
		System.out.println(revnum);
	   
   }
   
   
   
   
   
   
	
	
	
		
    		
		
		
		
	

}
