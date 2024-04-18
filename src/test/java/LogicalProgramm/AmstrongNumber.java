package LogicalProgramm;

import org.testng.annotations.Test;

public class AmstrongNumber {
	
	
	public void one_Thousand() {
		 int sum =0;
		
		for(int i=1; i<=1000; i++) {
			int x=i;
			while(x>0) {
				
				int rem = x%10;
				sum = sum+ (rem*rem*rem);
				x = x/10;
			}
			
			if(sum==i) {
				System.out.println("amstrong no : " + i);
			}
			sum=0;
		}
		
	}
	
	@Test
	public void isAmstrongNo() {
		
		int org=153; int sum=0;
		
		for(int i=org; i>0; i=i/10) {
			
			int rem = i%10;
			sum = sum+ (rem*rem*rem);	
		}
		if(org==sum) {
			System.out.println("Given no is amstrong no : " + org);
		}
		else{
			System.out.println("Given no is NOT amstrong no ");	
		}
	
		}
		
	


}
