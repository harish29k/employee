/**
 * 
 *Add Part timeEmployee & Wage 
 *
 */
public class Parttimeempuc3 {
	public static void main(String[] arg) {
		double empcheck=Math.floor(Math.random()*10)%3;
		if(1==empcheck){
		   System.out.println("employee is present");
		   int y=20*8;
           System.out.println("employee salary per day is "+y);	}
	   	else if(empcheck==2){
			System.out.println("employ is pesent for part time" );
			int sal=4*20;
			System.out.println("emp salary is today is "+sal);
		    }
		else{
		System.out.println("employee is absent today");
		}
		}

	}

