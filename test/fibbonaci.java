package test;

public class fibbonaci {

	public static void main(String[] args) {
		int n=14;
		int fib1=0;
		int fib2=1;
		System.out.println("fibbonacci series till"+" "+n);
		
		
		for (int i = 1; i<=n; ++i) {
		
	        int fibser=fib1+fib2;
			fib1=fib2;
		 fib2=fibser;
			
			System.out.println(fib1);
			
		}

	}

}
