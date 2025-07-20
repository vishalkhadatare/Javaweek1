import java.util.*;

public class GCD {
  public static void main(String[] args) {
    // Taking input of two numbers
    Scanner scn = new Scanner(System.in);
    int num1 = scn.nextInt();
    int num2 = scn.nextInt();

    int gcd = 1;

    for (int i = 1; i <= num1 && i <= num2; i++){
        if (num1 % i == 0 && num2 % i == 0)
            gcd = i;
    }
    System.out.println("GCD of " + num1 +" and " + num2 + " is " + gcd);
  }
}