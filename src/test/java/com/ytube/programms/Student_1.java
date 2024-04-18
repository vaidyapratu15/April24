package com.ytube.programms;



class Student_1 {
	
	Student_1(){
		System.out.println("one");
	}
	
	Student_1(int a){
		System.out.println("check super keyword");
	}
	


   public static class xyz  extends Student_1{
	 
	 xyz(){
		 super(100);   //this is for if we add any int parameter in constructor then to print this we needed.
			System.out.println("two");
	 }
	 
	 
	
		 
	  public static void main (String [] arg) {
		new  xyz();
	 }
	  
   }
}

// Here student1 and xyz both having constructor and we inheriated in xyz means this constructor also here execute 
// but as per concept constructor shoudnt inheriated but here ans is that when we inheriate then every constructor follow the super(); if we write or not it doesnt matter	 

	 
//-------------------now here add parameters so here need to show the super () word bz if we pass any input then 
	 
	 
	
			

		  
			 
			 
			
   	
	 
		   
