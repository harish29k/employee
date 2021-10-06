
/**
 * Calculating Wagesfor a Month
 * 
 *
 */
public class Wagemonthuc5 {
	public static void main(String[] args) {
		int totalsalary=0;
		int x=20;
		while(x>0) {
	    double empcheck=Math.floor(Math.random()*10)%3;
	int salary=0;
		if(1==empcheck){
		    salary=20*8;
           System.out.println("employee salary per day is "+salary);	}
	   	else if(empcheck==2){
			 salary=4*20;
			System.out.println("emp salary is today is "+salary);
		    }
		else{
		     System.out.println("employee is absent today");
		    }
			totalsalary=totalsalary+salary;
		x--;
		}
		System.out.println("the total salary of employ in this month is "+totalsalary);
	}
	}



