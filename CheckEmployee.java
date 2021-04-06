
public class CheckEmployee {
	public static final int MIN=0;
	public static final int MAX=1;
	
	public static void Compute(){
		int num = (int) (Math.random() * ( MAX - MIN + 1 ) + MIN );
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("*****Welcome to Employee Wage Computation*****");
		 Compute();
	}

}
