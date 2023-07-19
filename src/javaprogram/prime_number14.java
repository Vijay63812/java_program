package javaprogram;

public class prime_number14 {
	
	public static void main(String[] args) {
	
		int num=12;
		
		for(int i=2;i<num;i++) 
		
			if(num%i==0) {
				System.out.println("not prime number");
				break;
				
			}
		
			else if(num%i==0) {
            	System.out.println("prime number");
            }
}
}