package javaprogram;

public class fibonacci {

	public static void main(String[] args) {
		int a=-1;
		int b=1;
		int count=1;
		do {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			count++;
		}while(count<=8);
		    

	}

}
