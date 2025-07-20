// Program to check whether given number is prime or not

import java.util.*;

class primenumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int a = s.nextInt();
        int count = 0;

        for (int i = 1; i <= a; i++)
        {
            if (a % i == 0)
            {
                count++;
            }
        }

        if (count == 2)
        {
            System.out.println("Given number is a prime number.");
        }
        else
        {
            System.out.println("Given number is not a prime number.");
        }
    }
}