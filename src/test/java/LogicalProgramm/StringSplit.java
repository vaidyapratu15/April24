package LogicalProgramm;

import org.testng.annotations.Test;

public class StringSplit {
	

	public void split() {
		
		String arg = "Pratu is my name ";
		String [] s1 = arg.split(" ");
	   
		for(int i=s1.length-1; i>=0; i--) {
			System.out.print(s1[i]+" ");
		}	
	}
	
	public void splitPara() {
		
		String s = "Pratu L vaidya";
		String [] ar = s.split(" ");
		//here as per index you will get
		System.out.println(ar[0]); 	System.out.println(ar[1]); 	System.out.println(ar[2]);
		
		//full data split 
		for(int i=0; i<=ar.length-1; i++) {
			System.out.println(ar[0]); 	System.out.println(ar[1]); 	System.out.println(ar[2]);
		}
	}
	@Test
	public void reverse_EVEN_Odd_Index() {
		String s = "Heyaa it is me pratuuuu"; // 0 1 2 3 4 
		String [] ar = s.split(" ");
		
		for (int i=0; i<=ar.length-1; i++) {
			String org = ar[i];
			
			if(i%2==0) {     //even             // for odd (i%2!=0)
				System.out.println(reverseString(org));
			}else {
				//System.out.println(org);
			}
		}
		}
		
		public  static String reverseString(String org) {
			
	     String rev = "";
	     for (int j=org.length()-1; j>=0; j--) {
	    	 rev = rev + org.charAt(j);
	     }
	     return rev;
	    
		
	}

}
