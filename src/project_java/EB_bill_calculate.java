package project_java;

public class EB_bill_calculate {

	public static void main(String[] args) {
		int units=200;
	       double fixedcharge=0;
	       double totalcost=0;
	       if( units>0 && units<=100) {
	    	totalcost=0;   
	    	System.out.print(totalcost);
	    	       
	        } else if( units>100 && units<=200) {
	    	fixedcharge=2.25;
	    	totalcost=(100*0)+((units-100)*fixedcharge);
	    	System.out.print(totalcost);
	    	 
	        }else if( units>200 && units<=400) {
	    	fixedcharge=4.50;
	    	totalcost=(100*0)+(100*2.25)+((units-200)*fixedcharge);
	    	System.out.print(totalcost);
	    	 
	    	}else if(units>400 && units<=500) {
	    	fixedcharge=6.00;
	    	totalcost=(100*0)+(100*2.25)+(200*4.50)+((units-400)*fixedcharge);
	    	System.out.print(totalcost);
	    	 
	    	}else if(units>500 && units<=600) {
	    	fixedcharge=8.00;
	    	totalcost=(100*0)+(300*4.50)+(100*6.00)+((units-500)*fixedcharge);
	    	System.out.print(totalcost);
	    	 
	    	}else if(units>600 && units<=800) {
	    	fixedcharge=9.00;
	    	totalcost=(100*0)+(300*4.50)+(100*6.00)+(100*8.00)+((units-600)*fixedcharge);
	    	System.out.print(totalcost);
	    	 
	    	}else if(units>800 && units<=1000) {
	    	fixedcharge=10.00;
	    	totalcost=(100*0)+(300*4.50)+(100*6.00)+(100*8.00)+(200*9.00)+((units-800)*fixedcharge);
	    	System.out.print(totalcost);
	    	 
	    	}else
	    	fixedcharge=11.00;
	        totalcost=(100*0)+(300*4.50)+(100*6.00)+(100*8.00)+(200*9.00)+(200*10.00)+((units-1000)*fixedcharge);       
	        System.out.print(totalcost);
	           
		}
	       
	 
		}

