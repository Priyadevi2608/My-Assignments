package test;

public class isPrime {

	public static void main(String[] args) {
		int n=13;
		for (int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("not a prime");
				return;
			}
		}
		System.out.println("It is prime");
		}
	}
	