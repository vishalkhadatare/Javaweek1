import java.util.Scanner;

public class fabonaci
{	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many terms to display in the fib. series: ");
		int n = input.nextInt();
		int count = 0;
		int a = 0, b = 1, c = 0;
		System.out.println("Fibonacci series is: ");
		if(n == 1)
		{
			System.out.println("0");
		}
		else if(n == 2)
		{
			System.out.println("0 1");
		}
		else
		{
			System.out.print("0 1 ");
			count = 3;
			while(count <= n)
			{
				c = a + b;
				a = b;
				b = c;
				System.out.print(c + " ");
				count++;
			}
		}
		input.close();
	}
}