package LogicalProgramm;

import org.testng.annotations.Test;

public class EvenOdd_Prime_Factor {
	
	
	public void factor() {
		
		int fact=1; int num=5;
		
		for(int i=num; i>0; i--) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
	
	
	public void prime() {
		
		int num=7; int count=0;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 1) {
			System.out.println("Given no is not prime no");
		}else {
	       System.out.println("Given no is prime no");
		}
	}

    @Test
	public void even1_10() {
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {                                   // for odd  no
				System.out.println(i + "is EVEN no");
			}else {
				System.out.println(i + "is ODD no");
			}
		}
	}

}
