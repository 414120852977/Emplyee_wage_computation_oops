
public class DaysAndHoursReached {
	public static final int MIN = 0;
	public static final int MAX = 1;
	public static final int RATE_PER_HR = 20;
	public static final int IS_FULL_HR = 1;
	public static final int IS_PART_HR = 0;
	public static final int FULL_MONTH_DAY = 20;
	public static final int TOTAL_WORKING_DAYS = 20;
	public static final int TOTAL_WORKING_HOURS = 100;
	
	
	
	public static void Compute(){
		int num = (int) (Math.random() * ( MAX - MIN + 1 ) + MIN );
	System.out.println(num);
	}
	public static void Calculate(){
		int num = (int) (Math.random() * ( MAX - MIN + 1 ) + MIN );
		System.out.println(num);
		
		int emphr = 0,empwage ;
		switch(num){
		case IS_FULL_HR:
			emphr = 8;
			break;
		case IS_PART_HR:
			emphr = 4;
			break;
			default :
				
		}
		empwage = RATE_PER_HR * emphr;
		System.out.println("daily employee wage is :" + empwage);
		
	}
	public static void Monthwage(){
		int totalworkinghr=0,totalworkingday=0;
	
		while(totalworkinghr <= TOTAL_WORKING_HOURS && totalworkingday <= TOTAL_WORKING_DAYS )
			totalworkingday++;
		
		{
		int monthlywage=0;
		int num = (int) (Math.random() * ( MAX - MIN + 1 ) + MIN );
		System.out.println(num);
		
		int emphr = 0,empwage ;
		switch(num){
		case IS_FULL_HR:
			emphr = 8;
			break;
		case IS_PART_HR:
			emphr = 4;
			break;
			default :
				
		}
		empwage = RATE_PER_HR * emphr;
		monthlywage=empwage * FULL_MONTH_DAY ;
		System.out.println("monthly wage of a employee is :"+monthlywage);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("*****Welcome to Employee Wage Computation*****");
		 Compute();
		 Calculate();
		 Monthwage();
		 
	}


}
