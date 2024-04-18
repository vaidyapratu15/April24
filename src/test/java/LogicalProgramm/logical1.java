package LogicalProgramm;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class logical1 {

	
	public void multiple_2num_without_Mutiple_operation() {
		
		int num=2; int num2 =4; int sum=0;
		
		for(int i=1; i<=num; i++) {
			sum = sum + num2;
		}
		System.out.println(sum);	
	}
	
 
   public void compare_2_Interger_Arrays() {
	   
	   int ar1[] = { 10 , 20, 30 };
	   int ar2[] = { 24 , 1 ,9 };
	   int ar3[] = { 10 , 20, 30 };
	   
	   System.out.println( Arrays.equals(ar1, ar2));
	   System.out.println(Arrays.equals(ar2, ar3));
	   System.out.println( Arrays.equals(ar1, ar3));
   }
   
   @Test
   public void scanner() {
	   
	   @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	   System.out.print("Enter no:- ");
	   int num = scan.nextInt();
	   
	   System.out.print("Enter no2:- ");
	   int num2 = scan.nextInt();
	   
	   System.out.print("Enter name:- ");
	   String name = scan.next();
	   System.out.println(num);
	   System.out.println(name);
	   System.out.println(num + num2);
	     
   }
   
   
	
	
	
	

}
